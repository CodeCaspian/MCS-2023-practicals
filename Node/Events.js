//Create a js file named main.js for event-driven application. There should be a main loop that listens for events, and then triggers a callback function when one of those events is detected. [20 M]

var event = require('events')
var e = new event.EventEmitter()

function event_1(){
    console.log('event connection emitted')
}

function event_2(){
    console.log('event pratiksha emitted')
}

e.on('connection', event_1)
e.on('pratiksha', event_2)

e.emit('pratiksha')
e.emit('connection')