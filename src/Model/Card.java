package Model;
// CITATION:
// color codes generated using ChatGPT

public enum Card {
    THE_FOOL {
        @Override
        public String toString() {
            return "\u001B[38;5;123m┌────┐\n│ 0F │\n│ ☼  │\n└────┘\u001B[0m";
        }
    },
    THE_MAGICIAN {
        @Override
        public String toString() {
            return "\u001B[38;5;93m\n┌────┐\n│ I  │\n│ ☿  │\n└────┘\u001B[0m";
        }
    },
    THE_HIGH_PRIESTESS {
        @Override
        public String toString() {
            return "\u001B[38;5;250m\n┌────┐\n│ II │\n│ ☾  │\n└────┘\u001B[0m";
        }
    },
    THE_EMPRESS {
        @Override
        public String toString() {
            return "\u001B[38;5;113m┌────┐\n│III │\n│ ♀  │\n└────┘\u001B[0m";
        }
    },
    THE_EMPEROR {
        @Override
        public String toString() {
            return "\u001B[38;5;160m┌────┐\n│ IV │\n│ ♂  │\n└────┘\u001B[0m";
        }
    },
    THE_HIEROPHANT {
        @Override
        public String toString() {
            return "\u001B[38;5;178m┌────┐\n│ V  │\n│ ✝  │\n└────┘\u001B[0m";
        }
    },
    THE_LOVERS {
        @Override
        public String toString() {
            return "\u001B[38;5;205m┌────┐\n│ VI │\n│ ♡  │\n└────┘\u001B[0m";
        }
    },
    THE_CHARIOT {
        @Override
        public String toString() {
            return "\u001B[38;5;27m\n┌────┐\n│VII │\n│ ⚔  │\n└────┘\u001B[0m";
        }
    },
    STRENGTH {
        @Override
        public String toString() {
            return "\u001B[38;5;202m┌────┐\n│VIII│\n│ ༄  │\n└────┘\u001B[0m";
        }
    },
    THE_HERMIT {
        @Override
        public String toString() {
            return "\u001B[38;5;136m┌────┐\n│ IX │\n│ 🕯  │\n└────┘\u001B[0m";
        }
    },
    WHEEL_OF_FORTUNE {
        @Override
        public String toString() {
            return "\u001B[38;5;129m\n┌────┐\n│ X  │\n│ ☸  │\n└────┘\u001B[0m";
        }
    },
    JUSTICE {
        @Override
        public String toString() {
            return "\u001B[38;5;37m\n┌────┐\n│ XI │\n│ ⚖  │\n└────┘\u001B[0m";
        }
    },
    THE_HANGED_MAN {
        @Override
        public String toString() {
            return "\u001B[38;5;73m\n┌────┐\n│XII │\n│ ⛓  │\n└────┘\u001B[0m";
        }
    },
    DEATH {
        @Override
        public String toString() {
            return "\u001B[38;5;88m┌────┐\n│XIII│\n│ ☠  │\n└────┘\u001B[0m";
        }
    },
    TEMPERANCE {
        @Override
        public String toString() {
            return "\u001B[38;5;117m┌────┐\n│XIV │\n│ ⚗  │\n└────┘\u001B[0m";
        }
    },
    THE_DEVIL {
        @Override
        public String toString() {
            return "\u001B[38;5;196m┌────┐\n│ XV │\n│ ⛧  │\n└────┘\u001B[0m";
        }
    },
    THE_TOWER {
        @Override
        public String toString() {
            return "\u001B[38;5;226m┌────┐\n│XVI │\n│  ⚡︎ │\n└────┘\u001B[0m";
        }
    },
    THE_STAR {
        @Override
        public String toString() {
            return "\u001B[38;5;153m\n┌────┐\n│XVII│\n│ ★  │\n└────┘\u001B[0m";
        }
    },
    THE_MOON {
        @Override
        public String toString() {
            return "\u001B[38;5;54m┌────┐\n│XVIII│\n│ ☾  │\n└────┘\u001B[0m";
        }
    },
    THE_SUN {
        @Override
        public String toString() {
            return "\u001B[38;5;220m\n┌────┐\n│XIX │\n│ ☀  │\n└────┘\u001B[0m";
        }
    },
    JUDGEMENT {
        @Override
        public String toString() {
            return "\u001B[38;5;15m\n┌────┐\n│ XX │\n│ ☯  │\n└────┘\u001B[0m";
        }
    },
    THE_WORLD {
        @Override
        public String toString() {
            return "\u001B[38;5;48m┌────┐\n│XXI │\n│ 𐀪𐀪 │\n└────┘\u001B[0m";
        }
    },
    HIDDEN {
        @Override
        public String toString() {
            return "┌────┐\n│    │\n│    │\n└────┘\u001B[0m";
        }
    }
}















