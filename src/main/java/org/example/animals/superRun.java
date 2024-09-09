package org.example.animals;

public interface superRun {
    default boolean superRun(Object obj) {
             boolean out=false;
        if (obj instanceof Human) {
            if (((Human) obj).superRunCount) {
                System.out.println(((Human) obj).name + " пробежал с экстра");
                out =true;
            } else {
                System.out.println(((Human) obj).name + " не может пробежать с экстра, так как исчерпал все возможности");
                out =false;
            }
        } else if (obj instanceof Robot) {
            if (((Robot) obj).superRunCount>0) {
                System.out.println(((Robot) obj).name + " пробежал с экстра");
                out = true;
            } else {
                System.out.println(((Robot) obj).name + " не может пробежать с экстра, так как исчерпал все возможности");
                out = false;
            }
        }
        return out;
    }
}

