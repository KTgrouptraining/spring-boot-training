# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.springboot-training.helloworldapp' is invalid and this project uses 'com.springboottraining.helloworldapp' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)


Spring Boot:
-------------

5.	SLF4J,Spring JDBC , hikari connection pool , ehcache ,swagger,Spring AOP , Chain of filters ,Rest template 

SLF4J/log4j

logging

class{
Sysout("current ecext metod:XX class XX");

m1(){}
m1(){}m1(){}m1(){}m1(){}m1(){}m1(){}m1(){}m1(){}


}

Spring JDBC:


database
java code

JDBC
class.fornae();
establishing
creating the statments
executng the statments
getting the resutlset


libraries/dependedencies
maven
any build tool


ehcache:
10 hits--am tyig topull the sam data

stock mar


swagger:
--------

application:
100 end points




Spring AOP:
----------
m1(){


}
"packahe.*.*"


 Chain of filters:
 ----------------
 Request
 Response:
 



https://vc.larksuite.com/w/meeting/511377920?lang=en-US
input/payload/request:
511377920

output/resonse/responepayload:

filter1(){
}

Authenticationfilter(request,response){
thrw excpetion()
}


Rest template:
-------------


producer application(Paytm)
https://vc.larksuite.com/w/meeting/511377920?lang=en-US

input/payload/request
output/resonse/responepayload(200,staus)
restte.call amazon



Consumer application(amapozon)
https://vc.larksuite.com/w/meeting/511377920?lang=en-US

input/payload/request
output/resonse/responepayload(200,staus)
restte.call paytm




7.	Liquibase(developes wil not be worjing on this)

------------
x project mysql/oracle/h2


8.	Application DR  along with DB (ths is just an eplanation we cant try any example)

Disater Recovery

physical servers

x ---->multipe servers 
abcd(cloud   amazon web sercices/google cloud service/mircosoft azure/websep)

defg


Application

facebook application

code---->compile---->build(.jar/.zip/.war/.tar)----->deployment -->some application server(apache tomcat)--->publi be ale to access u appp
packaing in pom.xml

Maven
pom.xml
	

Spring security:
----------------
1.	Oatuh2 Concepts(network and security)
---------------------
x application
registaration of your profile
name
addvancemail


socail website or application(gmail/facebook/linkedin/twitter)



2.	API Gateway- wso2 (Basic)

www.abc.com/w/meeting/511377920
facebook.com

development--http://localhost:5000/appname/511377920






6.	Spring Boot Security :
-----------------------

http://localhost:5000/appname/511377920

secutiy(usernae/pwd)



Spring boot core concepts:
---------------------------
3.	Micro Services:

hospital managent system
doctore

patienns

staff

medicine

inpatients

billing

outpi

single app(monolith aoolication)


4.	Spring BootCore Concepts - Actuator ,JPA Repository(JPA), Logging ,Rest Annotation, Understanding the Spring Boot auto configuration, Rest Annotation with Relation DB

@Enity
@Coulmn
@tables
@repository
@transactional

banking application

x account--deposting 100 into y
y account--100 to be credited from x



x---->y,z,a,vd

transactonal managnent
Anthony( 9:48)--100 debit failed
Sampath()--100 credit filed



Actuator :
----------
dev/sit/qa/uat/production/dr

10 apps running in prod

ww.ddsf.com/actuator/health


JPA Repository(JPA):
-------------------
JDBC 
CRUD

framework(JPA)
all the basicqueries
create the tables/generate

queries
CRUD

Rest Annotation:
---------------
servlets/soap services(XML based code)/rest api or restfull web services json,xml,text/spring /spring boot

data formats

text formats
java
html

JSON format

class Student{
int age;
String anme;


}


list<Student>

Colletion framework

LISt
SET
MAp

JSON


[
{
"age":"27",
"name":"Anthony"


},
{
"age":"26",
"name":"xyz"


}
]

annotations:
-----------




@Path("http://localhost:1234/college/students/list")
@GET
@Consumes(type of format)
@Produces(type of frmat)
public List<Students> gwtStudents(){




}




@GET
@POST
@PUT
@DELETE



@Produces
@Consumes
@Path

select * from tablename;(GET)

insert into tabes(wef	q3f);(POST)

update tables ane set (PUT)

standards

@RestCntroller
@Service







Differnt topics under addvance java:
----------------------------------
5.	SLF4J,Spring JDBC , hikari connection pool , ehcache ,swagger,Spring AOP , Chain of filters ,Rest template 

producer 
consumer

condition1().condition2().condition();

Steaming cncepts:
-----------------
kafka with DR plan 
10.	Streaming API framework  
11.	Non Blocking IO with Spring Boot 2


incoming request(publisher) ----xx----mechanisim to process income request(subscriber)

any chat application

grouchat
----------
publihing the nessage

rabbit mq/active mq

netflix


publihser and subscriber technique






kafka server
zookeeper server
topics
producers
consuers

some pre requisitse:
---------------------
1. rest api/rstull web services/mvc/spring mvc/spring
boiler plate code(same)



we try to create or write endpoints/apis/services
https://vc.larksuite.com/w/meeting/511377920?lang=en-US


mobile based apps
web based apps------
desktop apps

main(){

}

core java

system A          Susyetm B
gta vicecity

CURD operations
Create
Update
Read
Delete

Table:
------
Student:
sid:   sname:   sadd: 

101     Anthony    Hyder



2.database



3.controllers
4.service
5.any database



woring stuructre:

we bunch f packages

realtime:

differnt layers(packages)

pogos
models
daos
util
service/manager
controllers
security
filters
entity



---------------------------------------------------
Maven
.java----->.class

project n number---->got geerating the .classess  --->command "maven install"
.jar/.war

first  remove all the exisitn .class ------"maven clean"


maven build ----"clean install"

pom.xml
-------
<packaging>war<packaging>
<packaging>jar<packaging>

legacy technologies:
servlets
normal core java


dependency


<dependencies>
<dependency></dependency>


x---->3 ore sub depes(transitive deps)


</dependencies>













some application server(tomcat)
--------------------------------
tomcat---.jar/.war
jboss
weblogic--.ear()
ibm web sphere



ide(elispse/sts)


java installled(yu atleat java 8)



calss path set in the envronment variabes



pakages in java



com.xyz.projectname
com.xyz.projectname.pojos
com.xyz.projectname.models



db

mysql--3306
oracle--1821/1521

server

port number


junits:


addition(it a,int b){




}



spring web

https://mvnrepository.com/


/welcom

Welcomee to be application



localhost:9091/students/list

select state


localhost:9091/votingaapp/states/list

[
{"name":"Andhra Pradesh"},
{"name":"Andhra Pradesh"},
{"name":"Andhra Pradesh"},
{"name":"Andhra Pradesh"},
{"name":"Andhra Pradesh"}
]


List<State>

{
name;
stateid




}


States
----------
Sid  Sname  
------------------
101   AP
102   MP
103   UP


depenedency

spring data jpa

h2(in memory database) a h2 depe


Basic details in order to connect db:
------------------------------------
username
password
db name
which datbased
drivers for that db



tables:
--------


states
-------
sid   name
101    AP
101    MP

unique/primary key



--------

interface


dev server

sit

qa

uat

hotfix

prod



[
    {
        "mid": 1,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 2,
        "name": "xyz",
        "district": "abc",
        "state": "jhcb"
    },
    {
        "mid": 3,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 4,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 5,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 6,
        "name": "Atmakur",
        "district": "Ananthapur",
        "state": "Andhra Pradesh"
    },
    {
        "mid": 7,
        "name": "Atmakur",
        "district": "Ananthapur",
        "state": "Andhra Pradesh"
    },
    {
        "mid": 101,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 102,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 104,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    }
]


www.xyz.com/users/102
gmail
https://gmail.com/login/userid/ksdnfn

path variable/path param

@PostMapping("jsbcja/jbau/{value}")
public void m1(@pathParam("value") String value){

}

xyz.com/users?userid=antony
&pwd=vnsskf&bal=ksv


@Putmapping
updating the existing

check if the record is already existing
then update

pull the records based on primary

if no records then say no records matching for updation

[
    {
        "mid": 5,
        "name": "xyz",
        "district": "xyz",
        "state": "jhcb"
    },
    {
        "mid": 6,
        "name": "Atmakur",
        "district": "Ananthapur",
        "state": "Andhra Pradesh"
    },
    {
        "mid": 8,
        "name": "abcd",
        "district": "def",
        "state": "Andhra Pradesh"
    }
]



@DeleteMapping
deleting the records



Hopitl project

patients
reception
doctors




hwo we can create end points

controllers

service

respository

CRUD operations

data jpa

multiple servers
dev
sit
uat
qa
dr
prod
hotfix


profile

db


service


resposity

frameork



rest api/api/servic/endpoint/url
https://vc.larksuite.com/w/meeting/511377920?lang=en-US

GET--retrieval
POST-insert
PUT-updation
DELETE-deletion

@RequestMapping(value="/w/meeting/511377920?lang=en-US",produces="aplication/json",consumes="aplication/json",requestMethod.GET)
int a;

@RequestMapping(value="/w/meeting/511377920?lang=en-IN")


Conteolller----->service/manager----->repositry---->enties---->db


Conteolller-----<service/manager<-----repositry<----enties<----db



servelts
servelts
servelts
servelts
servelts
servelts
servelts

----------

sopa web services--xml/.xsd/


-------------

rest full web services/rest api


------------------

spring

-------------------

spring boot


-------
logging levels

trace
debug
info
warning
error


Centrl logging system

Splunk
kibana


4xx--client side erro
5xx
2xx

Resttemplate:
-----------

I have 10 micro services

monolith application(vast application)

spliting into small pieces(split by modules/split by functioality)

mic1
countries micro service
save/countries


States micro service
mic2

save/countries

FeignClient
RestTempla


load  balancer

juntuh/osam

10 servers

sate-->feign--->base irl---->actual url---->cetral---gett he data

swagger (conecept)

@PostMapping(value = "/mandals/save/data")
	public String saveMandalIfnotExisting(@RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsbaseOnInputparams(mandalsModel);

	}
	
	URL:
	ENdpoint name
	Iputs
	type of the inputs
	return type
	status codes
	
	
	
	<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.4</version>
		</dependency>
		
		/swagger-ui.html
		/v3/api-docs
		
		
		kafka
		avtive q
		
		producer and consumer concepts
		publisher and subscriber
		
		youtube
		
		subscriber
		
		topic ---name
		
		kafka
		
		kafka server
		zookeeper server
		topics
		
		ott
		
		producer console----we can publish the messages
		consumer consle-- we will be bale to receive the message hich are pusblished
		
		
		how we can run thi in locaal
		
		
		
		spring boot --framework---active mq/kafka/rabiit mq
		kafka is 1 conce
		
		
		
		zookeeper server
		kafka server			
		
		topics
		
		producer console--pusbliher
		
		consumer console--audience
		
		
		
Apache Kafka
https://kafka.apache.org


post message in topic
>kafka-console-producer.bat --broker-list localhost:9092 --topic testtopic

Read message from topic
>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic testtopic --from-beginning

Create toopic
>kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic testtopic1

start zookeeper server
>zookeeper-server-start.bat D:\softwares\kafka_2.13-3.1.0\config\zookeeper.properties

start kafka server
>kafka-server-start.bat D:\softwares\kafka_2.13-3.1.0\config\server.properties



cheque deposit
		
		
		onwhich port ur kafka server is running
		topic
		
		write code to read meessages from topic mentioned  
		process them
		
		and the 
		
		store
		
		 micro services
		 1--prduces
		 2--consumer
		 
	{
	"studentnam"
	}
	
	reserved port number
	
	thyme leaf(ui relted stuff)
	
	mvc--
	model
	view(user interface)react.js/angular/java script
	controller
	
		
		w
		
		
		Collections:
		List
		Set
		Map
		
		Lst/Set ref= new ArrayList/HastSet<>();
		ref.add();
		
		Map<Key,Value> ref  new HashMap<>k,V();
		ref.put
		
		
		
		www.sbi.com/users/addaccount
		www.sbi.com/users/deleteaccount
		www.sbi.com/users/updateaccount
		
		
		if kafka server not running add the below in system and user variabls 
		
		%SystemRoot%\System32\Wbem;%SystemRoot%\System32\;SystemRoot%
		
		
		https://stackoverflow.com/questions/45524750/kafka-server-not-returning-anything
		
		
		Endpoint
Usage
/auditevents
Returns all auto-configuration candidates and the reason why they ‘were’ or ‘were not’ applied.
/beans
Returns a complete list of all the Spring beans in your application.
/mappings
Displays a collated list of all @RequestMapping paths..
/env
Returns list of properties in current environment
/health
Returns application health information.
/caches
It exposes available caches.
/conditions
Shows the conditions that were evaluated on configuration and auto-configuration.
/configprops
It displays a collated list of all @ConfigurationProperties.
/integrationgraph
It shows the Spring Integration graph. Requires a dependency on spring-integration-core.
/loggers
The configuration of loggers in the application..
/scheduledtasks
Displays the scheduled tasks in the application.
/sessions
Returns trace logs (by default the last 100 HTTP requests). Requires an HttpTraceRepository bean.
/httptrace
It allows retrieval and deletion of user sessions from a Spring Session-backed session store. Requires a Servlet-based web application using Spring Session.
/shutdown
Lets the application be gracefully shutdown. Disabled by default.
/threaddump
It performs a thread dump.
/metrics
It shows several useful metrics information like JVM memory used, system CPU usage, open files, and much more.
		
		
		
		
		
		
		
		
		



























