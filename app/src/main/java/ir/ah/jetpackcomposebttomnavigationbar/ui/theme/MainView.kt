package ir.ah.jetpackcomposebttomnavigationbar.ui.theme

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.*
import ir.ah.jetpackcomposebttomnavigationbar.*
import ir.ah.jetpackcomposebttomnavigationbar.ui.theme.screen.*


@Composable
fun MainView(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar = {
            BottomBar(
                navController
            )
        }
    )
    {
        BottomBarMain(navController)
    }

}
@Composable
fun BottomBarMain(navController : NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Search.route) {
            SearchScreen()
        }

        composable(Screen.Favourites.route) {
            FavouritesScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }
    }
}
