
# Android 4 All

This library will help you to build Android Apps.

repositories:

      maven { url 'https://jitpack.io' }  

dependencies:

	implementation 'com.github.alidali96:Android4All:v0.1'

## Some Examples



	private final Map<String, String> FOOD_API_HEADERS = new HashMap<>();
	FOOD_API_HEADERS.put("x-rapidapi-key", "YOUR_API_KEY_GOES_HERE");

	String requestURL = "https://mainapi.ca"	

    MainAPI.getInstance(getContext())
    .setHeaders(FOOD_API_HEADERS)
    .newRequest(Request.Method.GET, requestURL, null, this);
 
	
	
		
