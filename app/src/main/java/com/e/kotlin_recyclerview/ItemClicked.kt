package com.e.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ItemClicked : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_clicked)

        val img: ImageView = findViewById(R.id.imageView)
        val text: TextView = findViewById(R.id.Description)

        val titleText = intent?.extras?.getString("TITLE")
        val imageId = getImageByTitle(titleText)

        if (!titleText.isNullOrEmpty() && imageId != null) {
            img.setImageResource(imageId)
            text.text = getFullDescription(titleText)
        }
    }

    private fun getFullDescription(title: String?): String {
        return when (title) {
            "Nsibti Laaziza" -> {
                "Nsibti Laaziza (arabe : نسيبتي العزيزة, littéralement Ma belle-mère chérie) est une série télévisée humoristique tunisienne en langue arabe en 143 épisodes d'environ 30 minutes diffusée, durant le mois de ramadan, et ce en 2010, 2011 et de 2013 à 2018 sur Nessma. Elle a aussi été diffusée en Algérie et au Maroc."

            }
            "Falloujah" -> {
                "Une série tunisienne abordant la polygamie fait polémique,Dans l'une des scènes, une nouvelle enseignante, après avoir été draguée par des élèves en classe, découvre à sa sortie de l'école sa voiture taguée avec l'inscription Welcome to Fallujah."

            }

            "El Foundou" -> {
                "«El Foundou» est une série ramadanesque grand public diffusée sur une chaîne grand public, qui se hisse en tête des classements de l'audimat certes, mais qui reste prévisible, ordinaire, ponctuée d'évènements et de drames «Déjà vus» ailleurs, notamment dans d'autres productions étrangères."
            }
            "Awled Moufida" -> {
                "Awled Moufida arabe : أولاد مفيدة, littéralement Les Fils de Moufida, est un feuilleton télévisé social tunisien en quatorze épisodes de 41 minutes diffusés sur El Hiwar El Tounsi durant le ramadan 2015. Il est écrit et dialogué par Sami Fehri et Sadok Halwes, et réalisé par Fehri."
            }
            "Naouret El Hawa" -> {
                "Naouret El Hawa est une série télévisée dramatique tunisienne en 51 épisodes de 51 minutes créée par Riadh Samaâli et réalisée par Madih Belaïd. Elle est diffusée durant le mois du ramadan, à partir du 29 juin 2014 sur la Télévision tunisienne 1."
            }
            "Harga" -> {
                "  Harga  Scénarisé par Imed Eddine Hakim,  trace le récit d'un groupe de Tunisiens qui ne se connaissent pas, issus de différentes régions de Tunisie, et qui ont été contraints de migrer clandestinement en Italie. Leurs destins s'entrecroiseront en haute mer."          }

            "Maktoub" -> {
                " Maktoub Les problèmes familiaux, sociaux et conjugaux au sein de plusieurs familles tunisiennes. C'est aussi l'histoire de Choukri Ben Nfisa et Si Abess qui pratiquent le trafic de drogue et autres activités illégales."
            }
            "Choufli Hal" -> {
                "Choufli Hal, littéralement Trouve-moi une solution, est une série télévisée humoristique tunisienne, en arabe tunisien en 135 épisodes de 40 minutes, diffusée du 4 octobre 2005 au 19 septembre 2009 sur Tunisie 7 durant le mois de ramadan."            }


            else -> ""
        }
    }

    private fun getImageByTitle(title: String?): Int? {
        return when (title) {
            "Nsibti Laaziza" -> R.drawable.nsib
            "Falloujah" -> R.drawable.fal
            "El Foundou" -> R.drawable.elfond
            "Awled Moufida" -> R.drawable.mof
            "Naouret El Hawa" -> R.drawable.na
            "Harga" -> R.drawable.harga
            "Maktoub" -> R.drawable.makto
            "Choufli Hal" -> R.drawable.choff




            else -> null
        }
    }
}