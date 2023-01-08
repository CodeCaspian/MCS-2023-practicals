// Write node js script to interact with the filesystem, and serve a web page from a file.

var http = require("http")
var fs = require("fs")

var result = fs.readFileSync("14.html")

http.createServer((req, res)=>{
    res.write(result)
    res.end()
}).listen(8080)