from turtle import *
import colorsys

speed(0)
bgcolor("black")
h = 0
for i in range(16):
    for j in range(18):
        c = colorsys.hsv_to_rgb(h, 1, 1)
        color(c)
        h += 0.005
        rt(90)
        circle(150 - j * 6, 90)
        lt(90)
        circle(150 - j * 6, 90)
        rt(180)
    circle(40, 24)

y = 500
for x in range(20):
    stick = Turtle()
    stick.speed(0)
    stick.color("#73FF00")
    screen = stick.getscreen()
    stick.left(15)
    stick.forward(x - 5)
    stick.right(90)
    stick.forward(y - 25)
    stick.right(90)
    stick.forward(x - 5)
    stick.right(90)
    stick.forward(y - 25)
    stick.right(90)
stick.goto(0, 0)

stick.color("black")

stick.goto(0, 42)
for z in range(50):
    stick.color("#E66553")
    stick.speed(0)
    stick.forward(z)
    stick.left(59)
    
done()