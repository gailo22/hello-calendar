package com.gailo22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController {

	@RequestMapping("/download/{file_name}")
    public void download(@PathVariable("file_name") String fileName, HttpServletResponse response) {
        
		try {
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "attachment; filename=hello.pdf");
			
			File file = new File("D:\\dev\\project\\git\\hello-calendar\\src\\main\\resources\\hello.pdf");
			InputStream is = new FileInputStream(file);
			
			IOUtils.copy(is, response.getOutputStream());
			
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
}
