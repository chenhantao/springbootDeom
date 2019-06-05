package cht.Impl;

import org.springframework.stereotype.Component;

import cht.CompactDisc;

/**
 * TODO
 *
 * @author chenhantao
 * @since 2019/3/20
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt";
    private String artist = "artist";

    @Override
    public void play() {
        System.out.println("this is SgtPeppers playing");
    }
}
