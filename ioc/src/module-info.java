/**
 * 
 */
/**
 * @author Administrator
 *
 */
module ioc {
	requires spring.beans;
	requires spring.core;
	requires java.sql;
	requires spring.context;
	requires java.annotation;
	exports com.ust.ioc;
	exports com.ust.ioc2;
	exports com.ust.iocautowiring;
	exports com.ust.javaconfig;
	
	opens com.ust.javaconfig to spring.core;
	
}