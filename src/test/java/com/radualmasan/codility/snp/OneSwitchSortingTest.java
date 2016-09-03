package com.radualmasan.codility.snp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneSwitchSortingTest {

    private OneSwitchSorting oneSwitchSorting = new OneSwitchSorting();

    @Test
    public void testGivenInputSuccessful() throws Exception {
        assertTrue(oneSwitchSorting.isSortable(new int[]{1, 5, 3, 3, 7}));
    }

    @Test
    public void tastefulGivenInputUnsuccessful() throws Exception {
        assertFalse(oneSwitchSorting.isSortable(new int[]{1, 3, 5, 3, 4}));
    }

    @Test
    public void testGivenInputAlreadySorted() throws Exception {
        assertTrue(oneSwitchSorting.isSortable(new int[]{1, 3, 5}));
    }

    @Test
    public void testSmallestPossibleArray() throws Exception {
        assertTrue(oneSwitchSorting.isSortable(new int[]{1}));
    }

    @Test
    public void testLargestArray() throws Exception {
        assertFalse(oneSwitchSorting.isSortable(new int[]{487460598, 742630153, 870092160, 39843738, 601501211, 729215686, 376015548, 251097880,
                723265056, 816676981, 213984681, 64492935, 909733857, 583752520, 791825412, 490103150, 31988686,
                448234774, 933839790, 362606700, 925451904, 933905234, 3839992, 582824859, 234632000, 926632169,
                804087890, 213641895, 528564126, 660344320, 467593664, 783665634, 444685741, 626801508, 811540697,
                422070247, 751920106, 552554087, 420605130, 422524281, 217858775, 32890319, 823045050, 227248530,
                180075403, 856104725, 74040577, 471824715, 878624288, 394804689, 371099611, 520647335, 460146799,
                769722248, 894522625, 447567697, 412639415, 73277908, 536162501, 487954906, 923174883, 516589958,
                940698950, 370168929, 507408402, 206671910, 723074342, 206549376, 451783133, 521870982, 415265325,
                578243143, 509896091, 952710667, 827454112, 265967891, 600070066, 861951288, 90431239, 394028823,
                24531185, 648919129, 67325354, 404165768, 835992169, 508637446, 687419094, 603178441, 315326098,
                651356325, 763451792, 804173378, 540610936, 65596946, 858242458, 295631215, 452650357, 15759255,
                483171560, 305814349}));

    }
}
