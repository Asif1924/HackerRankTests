package com.alliconsulting.practice.app;

public class Version implements Comparable<Version>{
    static final String errorVersionMustNotBeNull = "'version' must not be null!";
    static final String errorOtherMustNotBeNull =  "'other' must not be null!";
    static final String errorVersionMustMatchPattern =  "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";    
    static final String constructorRegex = "\\d+(\\.\\d+){0,2}(-SNAPSHOT)?";
    
    private String version="";
	public Version(String version){
		if(version==null)
			throw new IllegalArgumentException(errorVersionMustNotBeNull);		
		if(!version.matches(constructorRegex))
			throw new IllegalArgumentException(errorVersionMustMatchPattern);
		this.version = version;
	}

	public boolean isSnapshot() {
		return version.contains("SNAPSHOT");
	}
	
	@Override
	public int compareTo(Version o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
