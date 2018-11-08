## Physical Computing (PhysComp)
making computers understand the physical world around us
+++
![Klima Kontrol by Roel Wouters](https://www.youtube.com/embed/s2fTLKIs9Z4)
+++
### how the computer sees you

![Tom Igoe Human](http://res.cloudinary.com/zilogtastic/image/upload/v1505408559/igoefinger_ie2ihx.jpg)
Note:
Tom Igoe, 2003
+++
Touchscreens, touchpads and the Kinect have changed this perception a little but it remains largely the same.
+++
### Kinect
![Skeletal tracking](http://res.cloudinary.com/zilogtastic/image/upload/v1505408570/kinect4_wnlfpb.png)

The Kinect introduced skeletal tracking for full-body interactions but as you can see the image that the computer has of the human is still **reductionist** at best.
+++
## electronics
 let us bridge the gap
**between the digital world**
**and the physical world**
---
# Arduino: a primer
+++
I'm sure you have heard about this Arduino thing.
+++
## Arduino
#### is a platform to program microcontrollers
(think of it as a wee little computer if you will)
+++
## A microcontroller
(your washing machine has one)

Note:
microcontrollers far exceed the number of computers in the world and they have been around for a very long time
+++
![sensors and actuators](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506374484/sensors_and_actuators_xhuves.png)
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
![blinky](http://res.cloudinary.com/zilogtastic/image/upload/v1506374484/LED_blink_cdxeci.png)
+++
#### Blink code
load it from the **examples > basics > Blink** menu
+++
## Sensing the world around you
sensors and what they do
+++
## What is a sensor?
A sensor is an electronic device that can transform a physical property of our world into an electrical signal that a computer can understand.

The only thing that you need to know about a sensor for now is that it is "a value that moves through time". People in finance call that a "ticker" in EE it's called a "signal" in electronic music they call it a "control signal" but in all of them they mean "a value that moves through time".
+++
## There are (for now) two types of sensors
We can classify them according to the kind of signal that they produce:
  - digital (two states)
    - shit happened (HIGH = 1)
    - shit didn't happen (LOW = 0)
  - analog
    - how much of the actual shit happened
    - it is often a number between 0 and 1024
+++
### Light-level sensor
setup your breadboard
![LDR sensor](http://res.cloudinary.com/zilogtastic/image/upload/c_scale,h_450/v1506369513/ldr_arduino_ppac8t.jpg)
---
### code
###### reading the LDR sensor with Arduino
---
## CHOICE
#### of sensors
+++
### Distance
- [Ultrasonic rangefinder](https://www.google.com/search?q=Ultrasonic+sensor)
- [IR sensor](https://www.google.com/search?q=IR+sensor)
### Presence & motion
- [PIR sensor](https://www.google.com/search?q=PIR+sensor) (passive infrared)
+++
### Smoke, gas and alcohol
- [MQ-2 smoke sensor](https://www.google.com/search?q=MQ-2+smoke+sensor)
- [MQ-3 Alcohol-ethanol (breathalyzer)](https://www.google.com/search?q=MQ-3+smoke+sensor)
+++
### Touch
- Button
- Switch
- [Potentiometer](https://www.google.com/search?q=potentiometer)
- Capacitive sensing
  - simple resistor circuit
  - [QT113](https://www.google.com/search?q=QT113+sensor)
+++
### Movement
- Tilt sensor
- Vibration sensor
- Joystick
+++
### Acceleration
- Accelerometer
- Gyroscope
- IMU (Inertial motion unit, 9-DoF)
+++
### Light
- LDR
- Flame sensor
- Color sensor (RGB)
- Camera (3CCD)
- Thermal camera
+++
### Weather
- Barometric pressure
- Wind (anemometer)
- Temperature
- Soil humidity
- Atmospheric humidity
+++
### Identity
- [Fingerprint scanner](https://www.google.com/search?q=fingerprint+sensor)
- RFID/NFC
- Keypad
+++
### Electricity and magnetism
- Magnetometer
- Hall effect sensor (magnetic fields)
- Compass
- Solar cell
+++
### Sound
- Microphone
- Clap sensor
+++
### Biosignals
Are kinds of signals that can be (continually) measured and monitored from biological beings. The term biosignal is often used to mean bio-electrical signal but in fact, biosignal refers to both electrical and non-electrical signals.
+++
### Biosignals (electrical)
- [EEG (electroencephalogram)](https://www.google.com/search?&q=EEG)
- EKG/ECG (electrocardiogram) 
- EMG (electromyographer)
- Respiration
- Goniometer (position / angle)
- Pulse oxymeter (pulse / light) aka [PPG photoplethysmography](https://www.google.com/search?q=ppg+sensor&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjg2vSDo8TeAhWtPOwKHZF2AtoQ_AUIDigB&biw=1099&bih=612)
- GSR (galvanic skin response, aka EDA electro dermal activity)
- Esthetoscope (sound)
- Ultrasound (device to listen to baby's heart)
+++
### Biosignals (acustic)
- Breathing rhythm (lungs)
- Muscles
- Heart
- Gut
+++
Most biosignals are either electrically weak or acoustically weak and they all are fairly complex, so they require heavy amplification are prone to noise and require extensive digital signal processing (DSP) before they can be used.
+++
### Example QRS complex
![QRS complex](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/SinusRhythmLabels.svg/1103px-SinusRhythmLabels.svg.png)
+++
### Brain activity
- [MUSE headband](https://choosemuse.com/)
- [Emotiv headset](https://www.emotiv.com/)
- [HOLST Centre](https://www.google.com/search?q=holst+centre+EEG+headset)
+++
- [EEG kiss sketch](https://vimeo.com/113102248)
- [EEG kiss theatrical setup](https://vimeo.com/158300331)
+++
### Biosensing platforms
- [BITalino](http://bitalino.com/en/)
- [BITalino sensor kit](http://biosignalsplux.com/en/products/sensors)
