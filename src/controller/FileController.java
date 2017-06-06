package controller;

import java.io.File;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {
	@RequestMapping(value = "file.action", method = RequestMethod.POST)
	public String uploadOneFile(@RequestParam("file") CommonsMultipartFile file) {
//		System.out.println(file.getOriginalFilename());
		String rootPath = "E:\\abc";
		String fileName = file.getOriginalFilename();// 获取文件名
		String filePath = rootPath + File.separator + fileName;// 根据系统获取分隔符
																// linux:/
													// windows:\
//		System.out.println(filePath);
		// 获取文件对象写入
		try {
			file.getFileItem().write(new File(filePath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "upload";
	}

	
	@RequestMapping(value = "multifile.action", method = RequestMethod.POST)
	public String uploadMultiFile(@RequestParam("file") CommonsMultipartFile[] files) {
		//System.out.println(file.getOriginalFilename());
		String rootPath = "E:\\abc";
		for(CommonsMultipartFile file : files){
			String fileName = file.getOriginalFilename();// 获取文件名
//			System.out.println(fileName);
			//确保文件名唯一性：避免文件的覆盖  加上时间戳
			String[] names = fileName.split("\\.");
//			System.out.println(names.length);
			//System.currentTimeMillis();
			String saveFileName = names[0]+new Date().getTime()+"."+names[1];
			
			String filePath = rootPath + File.separator + saveFileName;// 根据系统获取分隔符
													// linux:/
													// windows:\
//			System.out.println(filePath);
			// 获取文件对象写入
			try {
				file.getFileItem().write(new File(filePath));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "upload";
	}

}
