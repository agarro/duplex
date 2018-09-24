import numpy as np
from mpl_toolkits.mplot3d import Axes3D
from mpl_toolkits.mplot3d import proj3d
import matplotlib.pyplot as plt
import sys
import pylab

params=[]
text_file = open("par.txt", "r")
lines = text_file.readlines()
for line in lines:
    params.append(line)
text_file.close()

# print(params[0])
# print(params[1])
# print(params[2])
# print(params[3])
# print(params[4])

primaria = float(params[3])
secundaria = float(params[4])

fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

c='y'
m='o'
xs = 0
ys = 0
zs = 0
ax.scatter(xs, ys, zs, s=100, c=c, marker=m)
xs, ys, _ = proj3d.proj_transform(1,1,1, ax.get_proj())
label = pylab.annotate(
    params[0], 
    xy = (xs, ys), xytext = (-30, 30),
    textcoords = 'offset points', ha = 'right', va = 'bottom',
    bbox = dict(boxstyle = 'round,pad=0.5', fc = 'yellow', alpha = 0.5),
    arrowprops = dict(arrowstyle = '->', connectionstyle = 'arc3,rad=0'))
def update_position(e):
    x2, y2, _ = proj3d.proj_transform(1,1,1, ax.get_proj())
    label.xy = x2,y2
    label.update_positions(fig.canvas.renderer)
    fig.canvas.draw()
fig.canvas.mpl_connect('button_release_event', update_position)

a='b'
b='o'
xs = primaria
ys = primaria
zs = primaria * 20 /  100 
ax.scatter(xs, ys, zs,s= 60, c=a, marker=b)


z='r'
w='o'
xs = secundaria
ys = secundaria
zs = secundaria * 20 /  100
ax.scatter(xs, ys, zs, s= 40, c=z, marker=w)



ax.set_xlabel('Parsecs')
ax.set_ylabel('Parsecs')
ax.set_zlabel('Parsecs')

plt.show()

