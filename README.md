# Servlet-Tutorial
SERVLET is a technology which is used to create a web application. Servlet is an API that provides many interfaces and classes including documentation. Servlet is a web component that is deployed on the server to create a dynamic web page. Servlet is a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
There are 5 methods in Servlet interface:
public void init(ServletConfig config): initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once.
public void service(ServletRequest request,ServletResponse response): provides response for the incoming request. It is invoked at each request by the web container.
public void destroy(): is invoked only once and indicates that servlet is being destroyed.
public ServletConfig getServletConfig(): returns the object of ServletConfig.
public String getServletInfo(): returns information about servlet such as writer, copyright, version etc.
	Servlets are created in the web.xml under WEB-INF directory and are mapped to a java file:

	<servlet>
<servlet-name>sLogin</servlet-name>
	<servlet-class>controler.Login</servlet-class>
	</servlet>
 After that, Servlets will be mapped to an url pattern:

	<servlet-mapping>
<servlet-name>sLogin</servlet-name>
	<url-pattern>/login</url-pattern>  
	</servlet-mapping>
In the pom.xml file will be declared following dependencies:

	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>javax.servlet-api</artifactId>
	    <version>3.1.0</version>
	    <scope>provided</scope>        
	</dependency> 
	

	<dependency>
	 	<groupId>javax.servlet</groupId>
	 	<artifactId>jstl</artifactId>
	 	<version>1.2</version>
	</dependency>
