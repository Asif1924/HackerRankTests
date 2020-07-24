package com.alliconsulting.practice.tests;

import org.junit.jupiter.api.Test;
import com.alliconsulting.practice.app.Version;

class VersionTests {

	@Test
	public void testNullArgumentInConstructor() {
		try {
			Version v = new Version(null);
		}catch(Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	
	@Test
	public void testInvalidRegexInConstructor() {
		try {
			Version v = new Version("");
		}catch(Exception e) {
			System.out.println("Invalid Regex" + e.getMessage());
		}
	}

	@Test
    public void exampleTest() {
        Version version = new Version("3.8.0");
        // ...
    }

    @Test
    public void exampleTest2() {
        Version version = new Version("3.8.0-SNAPSHOT");
        // ...
    }

    @Test
    public void testIsSnapshot() {
        Version version = new Version("3.8.0-SNAPSHOT");
        if(version.isSnapshot())
        	log("Its a snapshot");
    }
    
    @Test
    public void testIsNotSnapshot() {
        Version version = new Version("3.8.0");
        if(!version.isSnapshot())
        	log("Its not a snapshot");
    }     
    
    private void log(String someString) {
    	System.out.println(someString);
    }
    // expected error messages:

    static final String errorVersionMustNotBeNull = "'version' must not be null!";
    static final String errorOtherMustNotBeNull =  "'other' must not be null!";
    static final String errorVersionMustMatchPattern =  "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";	
	
}
