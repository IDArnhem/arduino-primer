// install the Arduino SC Quarks
Quarks.update("arduino");
Quarks.install("arduino");
Quarks.gui;

// create an Arduino instance

(
p = ArduinoSMS("/dev/tty.wchusbserial1420", 9600);
)

(
SynthDef(\Sine, { arg add = 0;
	var sine;
	sine = SinOsc.ar(LinExp.kr(add, 0, 1024, 2000, 200),0,0.2,0);
	Out.ar(0,[sine,sine]);
}).send(s);
)


(
x = Synth(\Sine);
p.action = { | ... msg | x.set(\add,msg); };
)

(
p.close;
)

(
x.free;
)

