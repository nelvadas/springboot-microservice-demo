docker run -d -p 28017:27017   mongo

mongo --host=localhost —port=28017


b.tiers.insertOne({ "_id" : "001", "_class" : "fr.itce.msa.poc.model.Tiers", "firstName" : "ITCE", "lastName" : "POC" })


db.tiers.insertOne({ "_id" : "002", "_class" : "fr.itce.msa.poc.model.Tiers", "firstName" : "Nono", "lastName" : "Elvadas" })




> db.tiers.find()
{ "_id" : "001", "_class" : "fr.itce.msa.poc.model.Tiers", "firstName" : "ITCE", "lastName" : "POC" }
{ "_id" : "002", "_class" : "fr.itce.msa.poc.model.Tiers", "firstName" : "Nono", "lastName" : "Elvadas" }


>
Start the Microservice
with the application.properties 


MacBook-Pro-de-elvadas:tmp enonowog$ cat /tmp/mongo/application.properties 
spring.data.mongodb.host=127.0.0.1
spring.data.mongodb.port=28017
MacBook-Pro-de-elvadas:tmp enonowog$ 


java -jar -Dspring.config.location=file:/tmp/mongo/application.properties target/svc-recherche-tiers-1.0.0.jar


ovpn-118-62:initial enonowog$ http localhost:8080/tiers/
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Date: Wed, 22 Nov 2017 11:49:05 GMT
Transfer-Encoding: chunked

[
    {
        "customEnv": null,
        "firstName": "ITCE",
        "lastName": "POC",
        "ref": "001"
    },
    {
        "customEnv": null,
        "firstName": "Nono",
        "lastName": "Elvadas",
        "ref": "002"
    }
]






