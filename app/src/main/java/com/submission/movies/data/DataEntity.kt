package com.submission.movies.data

import com.submission.movies.R

object DataEntity {
    fun getMovies(): ArrayList<MoviesEntity> {
        return arrayListOf(
            MoviesEntity(
                "moviesBlackWidow",
                "Black Widow (2021)",
                "Natasha Romanoff, also known as Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. Pursued by a force that will stop at nothing to bring her down, Natasha must deal with her history as a spy and the broken relationships left in her wake long before she became an Avenger.",
                "2 Hours 13 Minutes",
                "Genre: Action | Adventure | Thriller",
                R.drawable.image_black_widow
            ),

            MoviesEntity(
                "moviesDon'tBreathe",
                "Don’t Breathe 2 (2021)",
                "The Blind Man has been hiding out for several years in an isolated cabin and has taken in and raised a young girl orphaned from a devastating house fire. Their quiet life together is shattered when a group of criminals kidnap the girl, forcing the Blind Man to leave his safe haven to save her.",
                "1 Hours 38 Minutes",
                "Genre: Horror | Thriller",
                R.drawable.image_dont_breathe2
            ),

            MoviesEntity(
                "moviesTheSuicideSquad",
                "The Suicide Squad (2021)",
                "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
                "2 Hours 12 Minutes",
                "Genre: Action | Adventure | Comedy | Science Fiction",
                R.drawable.image_the_suicide_squad
            ),

            MoviesEntity(
                "moviesFreeGuy",
                "Free Guy (2021)",
                "In \"Free Guy,\" a bank teller who discovers he is actually a background player in an open-world video game, decides to become the hero of his own story... one he rewrites himself. Now in a world where there are no limits, he is determined to be the guy who saves his world his way... before it is too late.",
                "1 Hours 53 Minutes",
                "Genre: Action | Adventure | Comedy | Science Fiction",
                R.drawable.image_free_guy
            ),

            MoviesEntity(
                "moviesGodzilla",
                "Godzilla vs Kong (2021)",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "1 Hours 53 Minutes",
                "Genre: Action | Science Fiction",
                R.drawable.image_godzilla_kong
            ),

            MoviesEntity(
                "moviesQuietPlace",
                "A Quiet Place Part II (2021)",
                "Following the events at home, the Abbott family now face the terrors of the outside world. Forced to venture into the unknown, they realize that the creatures that hunt by sound are not the only threats that lurk beyond the sand path.",
                "1 Hours 37 Minutes",
                "Genre: Horror | Science Fiction | Thriller",
                R.drawable.image_quite_place
            ),

            MoviesEntity(
                "moviesShangChi",
                "Shang-Chi and the Legend of the Ten Rings (2021)",
                "Shang-Chi, the master of weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.",
                "2 Hours 12 Minutes",
                "Genre: Action | Adventure | Fantasy",
                R.drawable.image_shang_chi
            ),

            MoviesEntity(
                "moviesConjuring",
                "The Conjuring: The Devil Made Me Do It (2021)",
                "Paranormal investigators Ed and Lorraine Warren encounter what would become one of the most sensational cases from their files. The fight for the soul of a young boy takes them beyond anything they’d ever seen before, to mark the first time in U.S. history that a murder suspect would claim demonic possession as a defense.",
                "1 Hours 51 Minutes",
                "Genre: Horror | Mystery | Thriller",
                R.drawable.image_the_conjuring
            ),

            MoviesEntity(
                "moviesSpiderman",
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "1 Hours 57 Minutes",
                "Genre: Action | Adventure | Animation | Science Fiction | Comedy",
                R.drawable.image_spiderman
            ),

            MoviesEntity(
                "moviesTheLastDragon",
                "Raya and the Last Dragon (2021)",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "1 Hours 47 Minutes",
                "Genre: Action | Adventure | Animation | Drama | Family | Fantasy",
                R.drawable.image_raya
            )
        )
    }

    fun getTvShows(): ArrayList<MoviesEntity> {
        return arrayListOf(
            MoviesEntity(
                "tvShowHanna",
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "50 Minutes",
                "Genre: Action & Adventure | Drama",
                R.drawable.image_hanna
            ),

            MoviesEntity(
                "tvShowHometown",
                "Hometown Cha-Cha-Cha (2021)",
                "A big-city dentist opens up a practice in a close-knit seaside village, home to a charming jack-of-all-trades who is her polar opposite in every way.",
                "1 Hours 10 Minutes",
                "Genre: Comedy | Drama | Drama Korea",
                R.drawable.image_hometown_cha_cha
            ),

            MoviesEntity(
                "tvShowStartUp",
                "Start-Up (2020)",
                "Needing to make \$90k to open her own business, Seo Dal Mi drops out of a university and takes up part-time work. She dreams of becoming someone like Steve Jobs. Nam Do San is the founder of Samsan Tech. He is excellent with mathematics. He started Samsan Tech two years ago, but the company is not doing well. Somehow, Nam Do San becomes Seo Dal Mi’s first love. They cheer each others start and growth.",
                "1 Hours 10 Minutes",
                "Genre: Comedy | Drama | Drama Korea",
                R.drawable.image_start_up
            ),

            MoviesEntity(
                "tvShowItaewon",
                "Itaewon Class (2020)",
                "On the first day of attending his new high school, Park Sae Roy gets into trouble after punching Jang Geun Won, who had been bullying a fellow classmate. Jang Dae Hee, the father of Jang Geun Won, is the CEO of the restaurant business Jagga, and the boss of Park Sae Roy father. After refusing to apologize for punching Jang Geun Won, Park Sae Roy father is fired, and he is ultimately expelled from school. Soon after, a tragic accident, caused by Jang Geun Won, takes place and Park Sae Ro Yoy’s father dies. Heartbroken and angry at his loss, Park Sae Roy viciously beats Jang Geun Won, earning himself time in prison. Deciding to take revenge upon the Jagga compony and the Jang family, Park Sae Roy opens his own restaurant in Itaewon, Seoul.",
                "25 Minutes",
                "Genre: Drama | Drama Korea",
                R.drawable.image_itaewon_class
            ),

            MoviesEntity(
                "tvShowVincenzo",
                "Vincenzo (2021)",
                "Vincenzo Cassano is an Italian lawyer and Mafia consigliere who moves back to Korea due to a conflict within his organization. He ends up crossing paths with a sharp-tongued lawyer named Cha-young, and the two join forces in using villainous methods to take down villains who cannot be punished by the law.",
                "1 Hours 20 Minutes",
                "Genre: Action | Adventure | Comedy | Drama Korea",
                R.drawable.image_vincenzo
            ),

            MoviesEntity(
                "tvShowMoneyHeist",
                "Money Heist (2017)",
                "La Casa de Papel (original title) To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion – memorizing every step, every detail, every probability – culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.",
                "1 Hours 10 Minutes",
                "Genre: Crime | Drama",
                R.drawable.image_money_heist
            ),

            MoviesEntity(
                "tvShowLupin",
                "Lupin (2021)",
                "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                "48 Minutes",
                "Genre: Crime | Drama | Mystery",
                R.drawable.image_lupin
            ),

            MoviesEntity(
                "tvShowLoki",
                "Loki (2021)",
                "After stealing the Tesseract during the events of “Avengers: Endgame,” an alternate version of Loki is brought to the mysterious Time Variance Authority, a bureaucratic organization that exists outside of time and space and monitors the timeline. They give Loki a choice: face being erased from existence due to being a “time variant”or help fix the timeline and stop a greater threat.",
                "52 Minutes",
                "Genre: Action | Adventure | Drama | Fantasy | Science Fiction",
                R.drawable.image_loki
            ),

            MoviesEntity(
                "tvShowTheFalcon",
                "The Falcon and the Winter Soldier (2021)",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "50 Minutes",
                "Genre: Action | Adventure | Drama | Fantasy | Science Fiction",
                R.drawable.image_the_falcon
            ),


            MoviesEntity(
                "tvShowAlice",
                "Alice in Borderland (2020)",
                "With his two friends, a video-game-obsessed young man finds himself in a strange version of Tokyo where they must compete in dangerous games to win.",
                "50 Minutes",
                "Genre: Action | Adventure | Drama | Fantasy | Mystery | Science Fiction",
                R.drawable.image_alice_in_bonderland
            )
        )
    }
}