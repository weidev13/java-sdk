package com.qiniu.qbox.fileop;

import com.qiniu.qbox.auth.CallRet;
import com.qiniu.qbox.auth.Client;

public class ImageExif {

	public static String makeRequest(String url) {
		return url + "?exif";
	}

	public static CallRet call(String url) {
		CallRet ret = new Client().call(makeRequest(url)) ;
		return ret;
	}
}
