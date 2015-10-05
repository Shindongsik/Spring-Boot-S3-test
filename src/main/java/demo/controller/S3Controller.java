package demo.controller;

import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import demo.service.S3Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/aws/s3")
public class S3Controller {

	@Autowired
	private S3Service s3Service;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public List<PutObjectResult> upload(@RequestParam("file") MultipartFile[] multipartFiles) {
		return s3Service.upload(multipartFiles);
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<byte[]> download(@RequestParam String key) throws IOException {
		return s3Service.download(key);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<S3ObjectSummary> list() throws IOException {
		return s3Service.list();
	}
}