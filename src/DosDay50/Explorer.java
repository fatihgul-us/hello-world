package DosDay50;

public class Explorer {
    public static void main(String[] args) {
        TxtFile txt =new TxtFile();
        PowerPointFile ppt = new PowerPointFile();
        DMGFile dmg = new DMGFile();
        EXEFile exe =new EXEFile();
        ReadFile file =new PowerPointFile();
        ReadFile file1= new TxtFile();


        WorkwithFile( txt);
        WorkwithFile( ppt);

    }

    public static void WorkwithFile(ReadFile file){
        System.out.println( file.open() );
        System.out.println( file.read() );
        System.out.println( file.save() );
        System.out.println(file.close() );
    }
}
