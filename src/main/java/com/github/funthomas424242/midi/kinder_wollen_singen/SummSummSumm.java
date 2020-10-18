package com.github.funthomas424242.midi.kinder_wollen_singen;

import jm.constants.ProgramChanges;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

import static jm.constants.Durations.EIGHTH_NOTE;
import static jm.constants.Durations.HALF_NOTE;
import static jm.constants.Durations.QUARTER_NOTE;
import static jm.constants.Pitches.a4;
import static jm.constants.Pitches.b0;
import static jm.constants.Pitches.b1;
import static jm.constants.Pitches.b2;
import static jm.constants.Pitches.b3;
import static jm.constants.Pitches.b4;
import static jm.constants.Pitches.b5;
import static jm.constants.Pitches.b6;
import static jm.constants.Pitches.b7;
import static jm.constants.Pitches.b8;
import static jm.constants.Pitches.c5;
import static jm.constants.Pitches.f4;
import static jm.constants.Pitches.g4;

public class SummSummSumm {

    public static final int INSTRUMENT = ProgramChanges.PIANO;

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
        final boolean show = false;
        final Part part = new Part( "Piano", INSTRUMENT);
        part.addPhrase(getPhrase1(show));
        part.addPhrase(getPhrase2(show));
        part.addPhrase(getPhrase3(show));
        part.addPhrase(getPhrase3(show));
        part.addPhrase(getPhrase1(show));
        part.addPhrase(getPhrase2(show));

        final Score score = new Score("Summ, Summ, Summ", 120.0);
        score.addPart(part);
        Write.midi(score, "SumSumSum.mid");
        Play.midi(score, true);
    }

    private Phrase getPhrase1(boolean show) {
        final Phrase phrase = new Phrase("Takt 1", 0.0, INSTRUMENT, true);

        int[] pitchArray = {
                c5, b4, a4};
        double[] rhythmArray = {
                QUARTER_NOTE, QUARTER_NOTE, HALF_NOTE
        };
        phrase.addNoteList(pitchArray, rhythmArray);
        if (show) View.notation(phrase);
        return phrase;
    }

    private Phrase getPhrase2(final boolean show) {
        final Phrase phrase = new Phrase("Takt 2", 0.0, INSTRUMENT, true);

        int[] pitchArray = {
                g4, a4, b4, g4, f4};
        double[] rhythmArray = {
                EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, HALF_NOTE,
        };
        phrase.addNoteList(pitchArray, rhythmArray);
        if (show) View.notation(phrase);
        return phrase;
    }

    private Phrase getPhrase3(boolean show) {
        final Phrase phrase = new Phrase("Takt 3", 0.0, INSTRUMENT, true);

        int[] pitchArray = {
                a4, b4, c5, a4, g4, a4, b4, g4};
        double[] rhythmArray = {
                EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE, EIGHTH_NOTE
        };
        phrase.addNoteList(pitchArray, rhythmArray);
        if (show) View.notation(phrase);
        return phrase;
    }

}