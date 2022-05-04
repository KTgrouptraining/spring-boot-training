# spring-security-jwt-example

Reference : https://jwt.io/

JWT token
spring security
custom uname/pwd
oauth2
---------------
Jwt token authication
correct uname
correct pwd

token will be genrated bases  on some parameters
username+secret(alphanumeric unique value)+claims(Map<String ,Sting>)
set expiry dor the token

-----------
some configuation
how each and every request need to be treated
www.com/users/authticate--no point passing the token
www.com/users/list- we need to pass the token

Security config---websecurtyconfigurer
configure(){

}

banking app
once u login
whoel/not more than 5 mins if its idle


-------------
filter chains

interceptor

is it valid token or not
is it still having tie to serve the request(nn expired tken)
allow requesrt to be processed further.

depe
----
jwt depency


lombok:
-----
thrid part library
boiler plate code

10 models
setters
getters
constructors
tostring

@Setters
@getters
@no
class Student

p1
p2
p3
p4

}
Student s = new Student();
sysout( s)
somevalue@hashcode
com.springboot.jwt.api.entity.Demo@15db9742
jbsdjfbdf@12345

toString()---from super class Object









