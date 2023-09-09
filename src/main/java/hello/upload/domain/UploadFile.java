package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    /*
    고객이 업로드한 파일 명
     */
    private String uploadFileName;

    /*
    서버 내부에서 관리하는 파일 명
     */
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
