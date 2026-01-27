package Model;
// CITATION: ChatGPT generated the colour codes used

public enum Card {
    THE_FOOL {
        public String toString() {
            return "\u001B[38;5;123m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;123m│ 0F │\u001B[0m\n" +
                    "\u001B[38;5;123m│ ☼  │\u001B[0m\n" +
                    "\u001B[38;5;123m└────┘\u001B[0m";
        }
    },
    THE_MAGICIAN {
        public String toString() {
            return "\u001B[38;5;93m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;93m│ I  │\u001B[0m\n" +
                    "\u001B[38;5;93m│ ☿  │\u001B[0m\n" +
                    "\u001B[38;5;93m└────┘\u001B[0m";
        }
    },
    THE_HIGH_PRIESTESS {
        public String toString() {
            return "\u001B[38;5;250m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;250m│ II │\u001B[0m\n" +
                    "\u001B[38;5;250m│ ☾  │\u001B[0m\n" +
                    "\u001B[38;5;250m└────┘\u001B[0m";
        }
    },
    THE_EMPRESS {
        public String toString() {
            return "\u001B[38;5;113m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;113m│III │\u001B[0m\n" +
                    "\u001B[38;5;113m│ ♀  │\u001B[0m\n" +
                    "\u001B[38;5;113m└────┘\u001B[0m";
        }
    },
    THE_EMPEROR {
        public String toString() {
            return "\u001B[38;5;160m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;160m│ IV │\u001B[0m\n" +
                    "\u001B[38;5;160m│ ♂  │\u001B[0m\n" +
                    "\u001B[38;5;160m└────┘\u001B[0m";
        }
    },
    THE_HIEROPHANT {
        public String toString() {
            return "\u001B[38;5;178m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;178m│ V  │\u001B[0m\n" +
                    "\u001B[38;5;178m│ ✝  │\u001B[0m\n" +
                    "\u001B[38;5;178m└────┘\u001B[0m";
        }
    },
    THE_LOVERS {
        public String toString() {
            return "\u001B[38;5;205m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;205m│ VI │\u001B[0m\n" +
                    "\u001B[38;5;205m│ ♡  │\u001B[0m\n" +
                    "\u001B[38;5;205m└────┘\u001B[0m";
        }
    },
    THE_CHARIOT {
        public String toString() {
            return "\u001B[38;5;27m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;27m│VII │\u001B[0m\n" +
                    "\u001B[38;5;27m│ V  │\u001B[0m\n" +
                    "\u001B[38;5;27m└────┘\u001B[0m";
        }
    },
    STRENGTH {
        public String toString() {
            return "\u001B[38;5;202m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;202m│VIII│\u001B[0m\n" +
                    "\u001B[38;5;202m│ =  │\u001B[0m\n" +
                    "\u001B[38;5;202m└────┘\u001B[0m";
        }
    },
    THE_HERMIT {
        public String toString() {
            return "\u001B[38;5;136m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;136m│ IX │\u001B[0m\n" +
                    "\u001B[38;5;136m│ 🕯 │\u001B[0m\n" +
                    "\u001B[38;5;136m└────┘\u001B[0m";
        }
    },
    WHEEL_OF_FORTUNE {
        public String toString() {
            return "\u001B[38;5;129m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;129m│ X  │\u001B[0m\n" +
                    "\u001B[38;5;129m│ ☸  │\u001B[0m\n" +
                    "\u001B[38;5;129m└────┘\u001B[0m";
        }
    },
    JUSTICE {
        public String toString() {
            return "\u001B[38;5;37m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;37m│ XI │\u001B[0m\n" +
                    "\u001B[38;5;37m│ ⚖  │\u001B[0m\n" +
                    "\u001B[38;5;37m└────┘\u001B[0m";
        }
    },
    THE_HANGED_MAN {
        public String toString() {
            return "\u001B[38;5;73m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;73m│XII │\u001B[0m\n" +
                    "\u001B[38;5;73m│ ⛓  │\u001B[0m\n" +
                    "\u001B[38;5;73m└────┘\u001B[0m";
        }
    },
    DEATH {
        public String toString() {
            return "\u001B[38;5;88m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;88m│XIII│\u001B[0m\n" +
                    "\u001B[38;5;88m│ ☠  │\u001B[0m\n" +
                    "\u001B[38;5;88m└────┘\u001B[0m";
        }
    },
    TEMPERANCE {
        public String toString() {
            return "\u001B[38;5;117m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;117m│XIV │\u001B[0m\n" +
                    "\u001B[38;5;117m│ #  │\u001B[0m\n" +
                    "\u001B[38;5;117m└────┘\u001B[0m";
        }
    },
    THE_DEVIL {
        public String toString() {
            return "\u001B[38;5;196m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;196m│ XV │\u001B[0m\n" +
                    "\u001B[38;5;196m│ +  │\u001B[0m\n" +
                    "\u001B[38;5;196m└────┘\u001B[0m";
        }
    },
    THE_TOWER {
        public String toString() {
            return "\u001B[38;5;226m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;226m│XVI │\u001B[0m\n" +
                    "\u001B[38;5;226m│ ⚡ ︎ │\u001B[0m\n" +
                    "\u001B[38;5;226m└────┘\u001B[0m";
        }
    },
    THE_STAR {
        public String toString() {
            return "\u001B[38;5;153m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;153m│XVII│\u001B[0m\n" +
                    "\u001B[38;5;153m│ ★  │\u001B[0m\n" +
                    "\u001B[38;5;153m└────┘\u001B[0m";
        }
    },
    THE_MOON {
        public String toString() {
            return "\u001B[38;5;54m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;54m│XVIII│\u001B[0m\n" +
                    "\u001B[38;5;54m│ ☾  │\u001B[0m\n" +
                    "\u001B[38;5;54m└────┘\u001B[0m";
        }
    },
    THE_SUN {
        public String toString() {
            return "\u001B[38;5;220m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;220m│XIX │\u001B[0m\n" +
                    "\u001B[38;5;220m│ ☀  │\u001B[0m\n" +
                    "\u001B[38;5;220m└────┘\u001B[0m";
        }
    },
    JUDGEMENT {
        public String toString() {
            return "\u001B[38;5;15m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;15m│ XX │\u001B[0m\n" +
                    "\u001B[38;5;15m│ ☯  │\u001B[0m\n" +
                    "\u001B[38;5;15m└────┘\u001B[0m";
        }
    },
    THE_WORLD {
        public String toString() {
            return "\u001B[38;5;48m┌────┐\u001B[0m\n" +
                    "\u001B[38;5;48m│XXI │\u001B[0m\n" +
                    "\u001B[38;5;48m│ 𐀪𐀪 │\u001B[0m\n" +
                    "\u001B[38;5;48m└────┘\u001B[0m";
        }
    },
    HIDDEN {
        public String toString() {
            return "┌────┐\n" +
                    "│    │\n" +
                    "│    │\n" +
                    "└────┘";
        }
    }
}
