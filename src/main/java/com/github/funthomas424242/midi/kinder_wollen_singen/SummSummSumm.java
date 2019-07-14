package com.github.funthomas424242.midi.kinder_wollen_singen;

import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

import javax.swing.text.ViewFactory;

import static jm.constants.Durations.*;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.*;

public class SummSummSumm {

    // englisches B = deutsches H
    public static final int h0 = b0;
    public static final int h1 = b1;
    public static final int h2 = b2;
    public static final int h3 = b3;
    public static final int h4 = b4;
    public static final int h5 = b5;
    public static final int h6 = b6;
    public static final int h7 = b7;
    public static final int h8 = b8;


    public static void main(String[] args) {

        SummSummSumm main = new SummSummSumm();
        main.play();
    }

    protected void play() {
        final Part part = new Part("Voice", VOICE);
        part.addPhrase(getPhrase1());
        part.addPhrase(getPhrase2());

        final Score score = new Score("Summ, Summ, Summ", 120.0);
        score.addPart(part);
        Play.midi(score, true);
    }

    private Phrase getPhrase1() {
        final Phrase phrase = new Phrase("Takt 1", 0.0, VOICE, true);

        int[] pitchArray = {
                c5, b4, a4};
        double[] rhythmArray = {
                QUARTER_NOTE, QUARTER_NOTE, HALF_NOTE
        };
        phrase.addNoteList(pitchArray, rhythmArray);
//        View.notation(phrase);
        return phrase;
    }

    private Phrase getPhrase2() {
        final Phrase phrase = new Phrase("Takt 2", 0.0, VOICE, true);

        int[] pitchArray = {
                g4, a4, b4, g4, f4};
        double[] rhythmArray = {
                EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, HALF_NOTE,
        };
        phrase.addNoteList(pitchArray, rhythmArray);
//        View.notation(phrase);
        return phrase;
    }

}