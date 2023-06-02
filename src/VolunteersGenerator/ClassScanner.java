package VolunteersGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClassScanner {


    public static List<String> getClassesFromPackage(String packageName) {
        List<String> classNames = new ArrayList<>();
        String path = packageName.replace('.', '/');
        String classPath = System.getProperty("java.class.path");
        String[] classPathEntries = classPath.split(File.pathSeparator);

        for (String classPathEntry : classPathEntries) {
            File baseDir = new File(classPathEntry + "/" + path);
            if (baseDir.exists() && baseDir.isDirectory()) {
                File[] files = baseDir.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile() && file.getName().endsWith(".class")) {
                            String className = packageName + "." + file.getName().substring(0, file.getName().length() - 6);
                            classNames.add(className);
                        }
                    }
                }
            }
        }

        return classNames;
    }
}
