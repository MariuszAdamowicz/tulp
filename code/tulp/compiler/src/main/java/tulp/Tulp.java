package tulp;

import java.io.File;

public class Tulp {
    public static void main(String[] args) throws Exception {
        new Tulp().doCommand(args);
    }

    private void doCommand(String[] args) throws  Exception {
        System.out.println("Started Tulp with command "+args[0]);
        if(args.length == 0) {
            System.out.println("Tulp syntax:");
            System.out.println("Tulp <command>");
            System.out.println("  commands:");
            System.out.println("  init - initiate build.stalk file");
            System.out.println("  doCommand <filename> - doCommand tulp file");
            System.out.println("  build - build application according to build.stalk file");
        } else {
            final String command = args[0];
            if(command.equals("init")) {
                System.out.println("Initialize build.stalk file");
            }
            if(command.equals("build")) {
                System.out.println("Building application");
            }
            if(command.equals("compile")) {
                int argSize = args.length;
                if(argSize >= 2) {
                    System.out.println("Compiling file " + args[1]);
                    final Compiler compiler = new Compiler();
                    if((argSize >= 4) && ("start".equals(args[2]))) {
                        compiler.setStartMethod(args[3]);
                    }
                    compiler.compile(new File(args[1]));
                }
            }
        }

//        final File tulpFile = new File(args[0]);
//        System.out.println("I'm here!");
//        final TulpTreeWalkListener ftwl = new TulpTreeWalkListener();
    }
}
