package com.github.funthomas424242.midi.kinder_wollen_singen;

import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

import static jm.constants.Durations.*;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.PIANO;

public class SummSummSumm {


    public static void main(String[] args) {

        SummSummSumm main = new SummSummSumm();
        main.playBienchen();
    }

    protected void playBienchen() {
        final Part part = new Part("Part Beschreibung", PIANO);
        part.add(getPhrase1());
        part.add(getPhrase2());
        part.add(getPhrase1().copy());

        final Score score = new Score("Piano", 120.0);
        score.add(part);
        View.notate(score);
        Play.midi(score,true);
    }

    private Phrase getPhrase1() {
        final Phrase phrase = new Phrase("Phrase 1", 0.0, PIANO, true);

        int[] pitchArray = {
                G4, F4, E4, D4,
                E4, F4, D4, C4
        };
        double[] rhythmArray = {
                HALF_NOTE, HALF_NOTE,
                WHOLE_NOTE,
                QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE,
                WHOLE_NOTE
        };
        phrase.addNoteList(pitchArray, rhythmArray);
        return phrase;
    }

    private Phrase getPhrase2() {
        final Phrase phrase = new Phrase("Phrase 2", 0.0, PIANO, true);

        int[] pitchArray = {
                E4, F4, G4, E4,
                D4, E4, F4, D4,
                E4, F4, G4, E4,
                D4, E4, F4, D4
        };
        double[] rhythmArray = {
                QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE,
                QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE,
                QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE,
                QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE, QUARTER_NOTE
        };
        phrase.addNoteList(pitchArray, rhythmArray);
        return phrase;
    }




}