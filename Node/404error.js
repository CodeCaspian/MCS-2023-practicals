//Create a Node.js file that opens the requested file and returns the content to the client. If anything goes wrong, throw a 404 error. 

var fs = require("fs")
var http = require("http")

//File callback has error and data
fs.readFile("test23.txt", (err, data)=>{
    http.createServer((req, res)=>{
        if(err){
            res.statusCode = 404
            res.end()
        }else{
        res.write(data)
        res.end()
        }
    }).listen(8080)
})
