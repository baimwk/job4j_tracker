package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> sizeComparator =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(sizeComparator);
        System.out.println(attachments);
        Comparator<Attachment> nameComparator =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                String leftName = left.getName();
                String rightName = right.getName();
                int rsl;
                for (int i = 0; i < Math.min(leftName.length(), rightName.length()); i++) {
                    rsl = Character.compare(leftName.charAt(i), rightName.charAt(i));
                    if (rsl != 0) {
                        return rsl;
                    }
                }
                return Integer.compare(leftName.length(), rightName.length());
            }
        };
        attachments.sort(nameComparator);
        System.out.println(attachments);
    }
}
