package org.gedraa;

import java.util.ArrayList;

public class VoptionParameters {

	double j =0.00;
	double h=0.00;
	double k=0.00;
	double galaclat=0.00;
	double pmra=0.00; 
	double pmdec=0.00;
	int _Voption =0;
	ArrayList<TwoMASS> _twoMASSList;
	ArrayList<UCAC3> _ucac3List = new ArrayList<UCAC3>();
	ArrayList<UCAC4> _ucac4List =  new ArrayList<UCAC4>();
	ArrayList<USNOB1> _usnob1List =  new ArrayList<USNOB1>();
	ArrayList<CMC14> _cmc14List =  new ArrayList<CMC14>();
	
	private String manualV;

	
	public VoptionParameters(int Voption, ArrayList<TwoMASS> twoMASS, 
		ArrayList<UCAC3> ucac3, ArrayList<UCAC4> ucac4,
		String manual, ArrayList<USNOB1> usnob1, 
		ArrayList<CMC14> cmc14)
	{
		_twoMASSList = twoMASS;
		_ucac3List = ucac3;
		_ucac4List = ucac4;
		_usnob1List = usnob1;
		_cmc14List = cmc14;	
		manualV=manual;

	}

	/**
     * @return the j
     */
    public synchronized final double getJ() {
    	return j;
    }

	/**
     * @return the h
     */
    public synchronized final double getH() {
    	return h;
    }

	/**
     * @return the k
     */
    public synchronized final double getK() {
    	return k;
    }

	/**
     * @return the galaclat
     */
    public synchronized final double getGalaclat() {
    	return galaclat;
    }

	/**
     * @return the pmra
     */
    public synchronized final double getPmra() {
    	return pmra;
    }

	/**
     * @return the pmdec
     */
    public synchronized final double getPmdec() {
    	return pmdec;
    }

	/**
     * @return the _Voption
     */
    public synchronized final int get_Voption() {
    	return _Voption;
    }

	/**
     * @return the _twoMASSList
     */
    public synchronized final ArrayList<TwoMASS> get_twoMASSList() {
    	return _twoMASSList;
    }

	/**
     * @return the _ucac3List
     */
    public synchronized final ArrayList<UCAC3> get_ucac3List() {
    	return _ucac3List;
    }

	/**
     * @return the _ucac4List
     */
    public synchronized final ArrayList<UCAC4> get_ucac4List() {
    	return _ucac4List;
    }

	/**
     * @param j the j to set
     */
    public synchronized final void setJ(double j) {
    	this.j = j;
    }

	/**
     * @param h the h to set
     */
    public synchronized final void setH(double h) {
    	this.h = h;
    }

	/**
     * @param k the k to set
     */
    public synchronized final void setK(double k) {
    	this.k = k;
    }

	/**
     * @param galaclat the galaclat to set
     */
    public synchronized final void setGalaclat(double galaclat) {
    	this.galaclat = galaclat;
    }

	/**
     * @param pmra the pmra to set
     */
    public synchronized final void setPmra(double pmra) {
    	this.pmra = pmra;
    }

	/**
     * @param pmdec the pmdec to set
     */
    public synchronized final void setPmdec(double pmdec) {
    	this.pmdec = pmdec;
    }

	/**
     * @param _Voption the _Voption to set
     */
    public synchronized final void set_Voption(int _Voption) {
    	this._Voption = _Voption;
    }

	/**
     * @param _twoMASSList the _twoMASSList to set
     */
    public synchronized final void set_twoMASSList(ArrayList<TwoMASS> _twoMASSList) {
    	this._twoMASSList = _twoMASSList;
    }

	/**
     * @param _ucac3List the _ucac3List to set
     */
    public synchronized final void set_ucac3List(ArrayList<UCAC3> _ucac3List) {
    	this._ucac3List = _ucac3List;
    }

	/**
     * @param _ucac4List the _ucac4List to set
     */
    public synchronized final void set_ucac4List(ArrayList<UCAC4> _ucac4List) {
    	this._ucac4List = _ucac4List;
    }

	/**
     * @return the manualVa
     */
    public synchronized final String getManualV() {
    	return manualV;
    }

	/**
     * @param manualVa the manualVa to set
     */
    public synchronized final void setManualV(String manualVa) {
    	this.manualV = manualVa;
    }

	/**
     * @return the _usnob1List
     */
    public synchronized final ArrayList<USNOB1> get_usnob1List() {
    	return _usnob1List;
    }

	/**
     * @return the _cmc14List
     */
    public synchronized final ArrayList<CMC14> get_cmc14List() {
    	return _cmc14List;
    }

	/**
     * @param _usnob1List the _usnob1List to set
     */
    public synchronized final void set_usnob1List(ArrayList<USNOB1> _usnob1List) {
    	this._usnob1List = _usnob1List;
    }

	/**
     * @param _cmc14List the _cmc14List to set
     */
    public synchronized final void set_cmc14List(ArrayList<CMC14> _cmc14List) {
    	this._cmc14List = _cmc14List;
    }
	
}
