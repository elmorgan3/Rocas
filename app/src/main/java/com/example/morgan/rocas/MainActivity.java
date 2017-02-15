package com.example.morgan.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private Toolbar ObToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObToolbar = (Toolbar)findViewById(R.id.tool_bar);

        //Este metodo nos pide un objeto de
        // tipo toolbar para actibarlo
        setSupportActionBar(ObToolbar);

        //ImageView imageView = (ImageView)findViewById(R.id.imageView);

        //imageView.setImageResource(android.R.drawable.ic_menu_edit);
    }

    public void mostrarInformacion (View view)
    {
        Intent i = new Intent (this, MainActivityInfo.class);

        startActivity(i);

    }

    //El @Override sirve para indicar que vamos a sobreescribir un metodo
    @Override
    public boolean onCreateOptionsMenu(Menu miMenu)
    {
        //en el metodo inflate hay que decirle el id del menu y el nombre del menu
        getMenuInflater().inflate(R.menu.menu_en_activity, miMenu);

        //Devolvemos un true para que esto sea visible desde la aplicacion
        return true;
    }

    //En este metodo indentificaremos que menu han seleccionado
    // y que haremos en consecuencia
    @Override
    public boolean onOptionsItemSelected(MenuItem opcionMenu)
    {
        //En esta variable guardaremos el id del menu que seleccionen
        int id = opcionMenu.getItemId();

        //Comprobamos el id seleccionado con la id de los posibles menus
        if (id == R.id.configuracion)
        {
            return true;
        }

        //Comprobamos el id seleccionado con la id de los posibles menus
        if (id == R.id.info)
        {
            //Llamamos al metodo de mostrar informacion
            //A este metodo habria que pasarle un objeto de tipo view pero como
            // no hay nada que pasarle, pondremos un null para que no de error
            mostrarInformacion(null);

            //Ahora devolvemos un true porque el metodo en el que estamos
            // deve devolver un booleano
            return true;
        }

        //El metodo en el que estamos obliga a devolver un booleano asi que en
        // el caso de que no entre en los dos if devolveremo un false
        return false;

        //Esto lo que hace es llamar a la clse super de la que hereda
        //return super.onOptionsItemSelected(opcionMenu);
    }

}
