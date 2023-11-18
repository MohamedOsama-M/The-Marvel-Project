package com.example.themarvelproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themarvelproject.model.Movie
import com.example.themarvelproject.ui.theme.TheMarvelProjectTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displayLarge,
                )
        },
        modifier = modifier
    )
}

@Composable
fun cardMaker ( Movie : Movie){
    Card (
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
//                .padding(5.dp),
        ) {
            Box(modifier = Modifier.clip(RoundedCornerShape(8.dp))){
                Image(painter = painterResource(id = Movie.posterRes), contentDescription = null)
            }
            Column (
                modifier = Modifier.padding(15.dp)
            ) {
                Text(
                    text = stringResource(id = Movie.movieName),
                    fontSize = 26.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = stringResource(id = Movie.dateRes),
                    fontSize = 26.sp
                )
                Spacer(modifier = Modifier.weight(1f))

            }
        }
    }
}


@Preview(showBackground = false,
    showSystemUi = false)
@Composable
fun TheMainScreenPreview() {
    TheMarvelProjectTheme {
        cardMaker(Movie(movieName = R.string.Movie_1, dateRes = R.string.Date_1, posterRes = R.drawable.iron_man_1))
    }
}