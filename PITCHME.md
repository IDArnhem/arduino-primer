#### we are in the
## "pictures through glass"
### age of interaction

Note:
open your calculator app in your phone, calculate something (anything) Didn't that feel a little glassy?
+++
![glasspiano](http://res.cloudinary.com/zilogtastic/image/upload/v1506376280/FeelDevice_e8h2rc.jpg)
+++
### the "pictures through glass" paradigm
is far older than the touchscreen of our phones
+++
![windows 95](http://res.cloudinary.com/zilogtastic/image/upload/v1506376449/WIndows_95_bevm6d.png)
+++
![Tool](http://res.cloudinary.com/zilogtastic/image/upload/v1506376280/Tool1_upnuaf.png)
###### I like Bret Victor's definition: A tool addresses human needs by amplifying human capabilities.
That is, a tool converts what we can do into what we want to do.
+++
![Tool 2](http://res.cloudinary.com/zilogtastic/image/upload/c_mfit,h_420/v1506376281/Tool2_j3mkqo.png)
A great tool is designed to fit both sides.
+++
#### the future as seen from 2011
![future](http://res.cloudinary.com/zilogtastic/image/upload/v1506376281/hands_sjrwis.png)
+++
![hands!](http://res.cloudinary.com/zilogtastic/image/upload/v1506376280/TitleHands_ujslg3.png)
+++
![hands feel things!](http://res.cloudinary.com/zilogtastic/image/upload/v1506376280/TitleFeel_rwk04m.png)
+++
![book](http://res.cloudinary.com/zilogtastic/image/upload/v1506376280/FeelBook_e0s5e7.jpg)
+++
![hands manipulate things](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/TitleManipulate_a0ejyv.png)
+++
![this is how we interact with our devices](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/ManipSlide_i4dhsg.jpg)
+++
![this is where else we use it](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/FingerPaint_afgc5u.jpg)
+++
![manipulating](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/Hands_wixb1m.jpg)
+++
![grips](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/Grips_nbp12q.jpg)
+++
![opening jar](http://res.cloudinary.com/zilogtastic/image/upload/v1506377218/Jar_daef6f.jpg)
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
## electronics
 let us bridge the gap
**between the digital world**
**and the physical world**
---
# Arduino: a primer
---
I'm sure you have heard about this Arduino thing.
---
## Arduino
#### is a platform to program microcontrollers
(think of it as a wee little computer if you will)
---
## A microcontroller
(your washing machine has one)

notes: microcontrollers far exceed the number of computers in the world and they have been around for a very long time
---
![sensors and actuators](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506374484/sensors_and_actuators_xhuves.png)
---
## Sensing the world around you
sensors and what they do
---
## What is a sensor?
A sensor is an electronic device that can transform a physical property of our world into an electrical signal that a computer can understand.

The only thing that you need to know about a sensor for now is that it is "a value that moves through time". People in finance call that a "ticker" in EE it's called a "signal" in electronic music they call it a "control signal" but in all of them they mean "a value that moves through time".
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
### If you have a cheap Arduino clone, get the driver
[CH340G serial driver install](https://kig.re/2014/12/31/how-to-use-arduino-nano-mini-pro-with-CH340G-on-mac-osx-yosemite.html)
+++
### Download and install the software (IDE)
[get a recent version, greater than 1.8](https://www.arduino.cc/en/Main/Software)
+++
### What's in the IDE?
+++
### Mac only
###### If you have problems: disable System Integrity Protection (SIP)
[Disable SIP](https://tzapu.com/making-ch340-ch341-serial-adapters-work-under-el-capitan-os-x/)
+++
### Verify
###### Can I see my Arduino in the list of ports in the IDE?
if so let's move on
+++
### The canonical blinking LDE
http://res.cloudinary.com/zilogtastic/image/upload/v1506374484/LED_blink_cdxeci.png
+++
#### Blink code
load it from the **examples > basics > Blink** menu
+++
### set this circuit in your breadboard
![LDR sensor](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506369513/ldr_arduino_ppac8t.jpg)
---
### demo
###### reading the LDR sensor with Arduino
---
## CHOICE
#### of sensors
+++
### Distance
Ultrasonic sensor
IR sensor
Compound eye sensor
+++
### Smoke, gas and alcohol

MQ-2 smoke sensor
Alcohol (breathalyzer)
+++
### Touch

Button
Switch
Potentiometer
Capacitive sensing
  - simple resistor circuit
  - QT113
  better when your laptop is connected to power
Flexiforce
+++
### Movement

Tilt sensor
Vibration sensor
Knob
Joystick
+++
### Acceleration
Accelerometer
Gyroscope
+++
### Light

LDR
Flame sensor
Color sensor
+++
### Weather

Altimeter
Atmospheric pressure
Wind (anemometer)
Temperature
Soil humidity
Atmospheric humidity

+++
### Identity

Fingerprint scanner
RFID
Keypad
+++
### Electricity and magnetism

Magnetometer
Hall effect sensor (magnetic fields)
Compass
Solar cell
+++
### Sound

Microphone
Clap sensor
