// Create a Node.js file that will convert the output "Hello World!" into upper-case letters

var http = require("http")

http.createServer((req, res)=>{
    res.write("hello world".toUpperCase())
    res.end()
}).listen(8080)