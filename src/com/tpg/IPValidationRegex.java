package com.tpg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	
	
	private Pattern pattern;
    private Matcher matcher;
    
    //private static final String FILENAME = "E:\\test\\filename.txt";
    
    private final File FILENAME = new File(getClass().getResource("ip.txt").getFile());
    
    public File getFileName() {
    	return FILENAME;
    }
    
        
    private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPValidationRegex() {
	  pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

    public boolean validate(final String ipAddress){		  
	  matcher = pattern.matcher(ipAddress);
	  return matcher.matches();	    	    
    }
    
    
    public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		
		IPValidationRegex ipValidationRegex = new IPValidationRegex();

		try {

			fr = new FileReader(ipValidationRegex.getFileName());
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(ipValidationRegex.getFileName()));

			while ((sCurrentLine = br.readLine()) != null) {
				Boolean res = ipValidationRegex.validate(sCurrentLine);
				if (res.booleanValue()) {
					System.out.println(sCurrentLine);
				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
    

}
