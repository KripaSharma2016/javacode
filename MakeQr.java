package program;


import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import javax.imageio.ImageIO;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skripa
 */
public class MakeQr {
    // add first jar files qrgen-1.0.jar, zxing-core-1.7 and zxing-j2se-1.7
    public static void main(String[] args) throws Exception {
        String details = "Name : Kripa Shankr Sharma , Address : Bulandshahr , Mob Number : 7812945475";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        File fs = new File("C:\\Java Study Material\\QRCODE\\kripa2.jpg");
        FileOutputStream fos = new FileOutputStream(fs);
        fos.write(out.toByteArray());
        fos.flush();
        //System.out.println(readQRCode());
    }
    public static String readQRCode()
			throws FileNotFoundException, IOException, NotFoundException {
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
				new BufferedImageLuminanceSource(
						ImageIO.read(new FileInputStream("C:\\Java Study Material\\QRCODE\\kripa.jpg")))));
		Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap);
		return qrCodeResult.getText();
	}
}

//ckage com.javapapers.java;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.imageio.ImageIO;
//
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.BinaryBitmap;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.MultiFormatReader;
//import com.google.zxing.MultiFormatWriter;
//import com.google.zxing.NotFoundException;
//import com.google.zxing.Result;
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
//import com.google.zxing.common.HybridBinarizer;
//import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
//
//public class QRCode {
//
//	public static void main(String[] args) throws WriterException, IOException,
//			NotFoundException {
//		String qrCodeData = "Hello World!";
//		String filePath = "QRCode.png";
//		String charset = "UTF-8"; // or "ISO-8859-1"
//		Map hintMap = new HashMap();
//		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//
//		createQRCode(qrCodeData, filePath, charset, hintMap, 200, 200);
//		System.out.println("QR Code image created successfully!");
//
//		System.out.println("Data read from QR Code: "
//				+ readQRCode(filePath, charset, hintMap));
//
//	}
//
//	public static void createQRCode(String qrCodeData, String filePath,
//			String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
//			throws WriterException, IOException {
//		BitMatrix matrix = new MultiFormatWriter().encode(
//				new String(qrCodeData.getBytes(charset), charset),
//				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
//		MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
//				.lastIndexOf('.') + 1), new File(filePath));
//	}
//
//	public static String readQRCode(String filePath, String charset, Map hintMap)
//			throws FileNotFoundException, IOException, NotFoundException {
//		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
//				new BufferedImageLuminanceSource(
//						ImageIO.read(new FileInputStream(filePath)))));
//		Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap,
//				hintMap);
//		return qrCodeResult.getText();
//	}
