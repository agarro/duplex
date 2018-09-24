package org.gedraa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.*;

public class RedirectFrame extends JFrame {
	 
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
    private boolean catchErrors;
    private boolean logFile;
    private String fileName;
    @SuppressWarnings("unused")
    private int width;
    @SuppressWarnings("unused")
    private int height;
    @SuppressWarnings("unused")
    private int closeOperation;
 
 
    TextArea aTextArea = new TextArea("",1000,1000,TextArea.SCROLLBARS_BOTH);
    PrintStream aPrintStream  =
       new PrintStream(
         new FilteredStream(
           new ByteArrayOutputStream()));
 
    /** Creates a new RedirectFrame.
     *  From the moment it is created,
     *  all System.out messages and error messages (if requested)
     *  are diverted to this frame and appended to the log file 
     *  (if requested)
     *
     * for example:
     *  RedirectedFrame outputFrame =
     *       new RedirectedFrame
                (false, false, null, 700, 600, JFrame.DO_NOTHING_ON_CLOSE);
     * this will create a new RedirectedFrame that doesn't catch errors,
     * nor logs to the file, with the dimentions 700x600 and it doesn't 
     * close this frame can be toggled to visible, hidden by a controlling 
     * class by(using the example) outputFrame.setVisible(true|false)
     *  @param catchErrors set this to true if you want the errors to 
     *         also be caught
     *  @param logFile set this to true if you want the output logged
     *  @param fileName the name of the file it is to be logged to
     *  @param width the width of the frame
     *  @param height the height of the frame
     *  @param closeOperation the default close operation
     *        (this must be one of the WindowConstants)
     */
    public RedirectFrame
       (boolean catchErrors, boolean logFile, String fileName, int width,
         int height, int closeOperation, String title) {
 
        this.catchErrors = catchErrors;
        this.logFile = logFile;
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        this.closeOperation = closeOperation;
 
        Container c = getContentPane();
        aTextArea.setBackground(Color.BLACK);
        aTextArea.setForeground(Color.GREEN);
        
        setTitle(title);
        setSize(width,height);
        c.setLayout(new BorderLayout());
        c.add("Center" , aTextArea);
        displayLog();
 
        this.logFile = logFile;
 
        System.setOut(aPrintStream); // catches System.out messages
        if (catchErrors)
            System.setErr(aPrintStream); // catches error messages
 
        // set the default closing operation to the one given
        setDefaultCloseOperation(JFrame.ICONIFIED);
 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image im = tk.getImage("myicon.gif");
        setIconImage(im);
    }
 
 
 
    class FilteredStream extends FilterOutputStream {
        public FilteredStream(OutputStream aStream) {
            super(aStream);
          }
 
        public void write(byte b[]) throws IOException {
            String aString = new String(b);
            aTextArea.append(aString);
        }
 
        public void write(byte b[], int off, int len) throws IOException {
            String aString = new String(b , off , len);
            aTextArea.append(aString);
            if (logFile) {
                FileWriter aWriter = new FileWriter(fileName, true);
                aWriter.write(aString);
                aWriter.close();
            }
        }
    }
 
    private void displayLog() {
        Dimension dim = getToolkit().getScreenSize();
        Rectangle abounds = getBounds();
        setLocation((dim.width - abounds.width) / (dim.width - abounds.width),
                    (dim.height - abounds.height) / 2);
        setVisible(true);
        requestFocus();
    }
 
}