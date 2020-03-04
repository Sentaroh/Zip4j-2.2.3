package net.lingala.zip4j.model.enums;

import net.lingala.zip4j.exception.ZipException;

public enum CompressionMethod {

  STORE(0),
  SHRUNK(1),		//Added by F.H
  COMP_FACTOR1(2),	//Added by F.H 
  COMP_FACTOR2(3),	//Added by F.H
  COMP_FACTOR3(4),	//Added by F.H
  COMP_FACTOR4(5),	//Added by F.H
  IMPLOD(6),		//Added by F.H
  RESERVED_7(7),	//Added by F.H
  DEFLATE(8),
  DEFLATE64(9),	//Added by F.H
  PKWARE_IMPLODING(10),//Added by F.H
  RESERVED_11(11),	//Added by F.H
  BZIP2(12),		//Added by F.H
  RESERVED_13(13),	//Added by F.H
  LZMA(14),			//Added by F.H
  RESERVED_15(15),	//Added by F.H
  IBM_CMPSC(16),	//Added by F.H
  RESERVED_17(17),	//Added by F.H
  IBM_TERE(18),	//Added by F.H
  IBM_LZ77(19),	//Added by F.H
  JPEG(96),			//Added by F.H
  WAVPACK(97), 	//Added by F.H
  PPMD(98),			//Added by F.H
  AES_INTERNAL_ONLY(99),//Added by F.H
  UNKNOWN_COMPRESSION_METHOD(999);

  private int code;

  CompressionMethod(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static CompressionMethod getCompressionMethodFromCode(int code) throws ZipException {
    for (CompressionMethod compressionMethod : values()) {
      if (compressionMethod.getCode() == code) {
        return compressionMethod;
      }
    }
    return UNKNOWN_COMPRESSION_METHOD;
//    throw new ZipException("Unknown compression method", ZipException.Type.UNKNOWN_COMPRESSION_METHOD);
  }
}
