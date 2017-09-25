### we are in the "pictures through glass" age of interaction

Note:
open your calculator app in your phone, calculate something (anything) Didn't that feel a little glassy?
---
### the "pictures through glass" paradigm
is far older than the touchscreen of our phones

---
## Physical Computing (PhysComp)
making computers understand the physical world around us
---
![Klima Kontrol by Roel Wouters](https://www.youtube.com/embed/s2fTLKIs9Z4)
---
### how the computer sees you

![Tom Igoe Human](http://res.cloudinary.com/zilogtastic/image/upload/v1505408559/igoefinger_ie2ihx.jpg)

+++

Touchscreens, touchpads and Kinect have changed this perception a little but it remains largely the same.

+++
### Kinect
![Skeletal tracking](http://res.cloudinary.com/zilogtastic/image/upload/v1505408570/kinect4_wnlfpb.png)


The Kinect introduced skeletal tracking for full-body interactions but as you can see the image that the computer has of the human is still **reductionist** at best.

---
electronics let us bridge the gap between the digital domain and the physical world
---
# Arduino: a primer
---
I'm sure you have heard about this Arduino thing.
---
## Arduino is a microcontroller
(think of it as a wee little computer if you will)
---
## A microcontroller
(your washing machine has one)

notes: microcontrollers far exceed the number of computers in the world and they have been around for a very long time
---
## Sensing the world around you
sensors and what they do
---
## What is a sensor?
A sensor is an electronic device that can transform a physical property of our world into an electrical signal that a computer can understand.

In effect, the only thing that you ever need to know about a sensor is that it is "a number that moves through time".
---
## There are (for now) two types of sensors
We can classify them according to the kind of signal that they produce:
  - digital (two states)
    - shit happened (HIGH = 1)
    - shit didn't happen (LOW = 0)
  - analog
    - how much of the actual shit happened
    - it is often a number between 0 and 1024
---
## Working with Arduino
+++
## Inspecting your kit
what are all these weird objects?
+++
#### breadboard
![breadboard](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_420/v1506374485/breadboard_ywjkvo.png)
+++
#### the arduino platform: the UNO
![Arduino Uno](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506370084/arduino_uno_wwnmzi.jpg)
+++
#### the arduino platform: the NANO
![Arduino NANO](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_520/v1506370085/ARDUINO_NANO_03_ltdqb1.png)
+++
### Download and install the software (IDE)
[get a recent version, greater than 1.8](https://www.arduino.cc/en/Main/Software)
+++
### What's in the IDE?
+++
### Cheap Chinese Arduinos
[CH340G serial driver install](https://kig.re/2014/12/31/how-to-use-arduino-nano-mini-pro-with-CH340G-on-mac-osx-yosemite.html)
+++
## Mac only: Disable System Integrity Protection
[Disable SIP](https://tzapu.com/making-ch340-ch341-serial-adapters-work-under-el-capitan-os-x/)
+++
## Verify: Can I see my Arduino in the list of ports in the IDE?
if so let's move on
+++
### set this circuit in your breadboard
![LDR sensor](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506369513/ldr_arduino_ppac8t.jpg)
---
### Distance
Ultrasonic sensor
IR sensor
Compound eye sensor
---
### Smoke, gas and booze

MQ-2 smoke sensor
Alcohol (breathalyzer)
---
### Touch

Button
Switch
Potentiometer
Capacitive sensing
  - simple resistor circuit
  - QT113
  better when your laptop is connected to power
Flexiforce
---
### Movement

Tilt sensor
Vibration sensor
Knob
Joystick
---
### Acceleration
Accelerometer
Gyroscope

---
### Light

LDR
Flame sensor
Color sensor
---
### Weather

Altimeter
Atmospheric pressure
Wind (anemometer)
Temperature
Soil humidity
Atmospheric humidity

---
### Identity

Fingerprint scanner
RFID
Keypad
---
### Electricity and magnetism

Magnetometer
Hall effect sensor (magnetic fields)
Compass
Solar cell
---
### Sound

Microphone
Clap sensor
