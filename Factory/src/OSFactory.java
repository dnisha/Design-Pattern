public class OSFactory {

    public void create(final String OSType) {
        OS os;
        if (OSType.equals("android")) {
            os = new Android();
        } else if (OSType.equals("ios")) {
            os = new IOS();
        } else {
            os = new Windows();
        }
        os.specs();
    }
}
