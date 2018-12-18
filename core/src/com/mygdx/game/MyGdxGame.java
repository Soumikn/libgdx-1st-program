package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

////
////import com.badlogic.gdx.ApplicationAdapter;
////import com.badlogic.gdx.Gdx;
////import com.badlogic.gdx.graphics.GL20;
////import com.badlogic.gdx.graphics.Texture;
////import com.badlogic.gdx.graphics.g2d.SpriteBatch;
////
public class MyGdxGame extends ApplicationAdapter {
////	SpriteBatch batch;
////	Texture img;
////
////	@Override
////	public void create () {
////		batch = new SpriteBatch();
////		img = new Texture("android/assets/badlogic.jpg");
////	}
////
////	@Override
////	public void render () {
////		Gdx.gl.glClearColor(1, 1, 1, 1);
////		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
////		batch.begin();
////		batch.draw(img, 10, 20);
////		batch.end();
////	}
////
////	@Override
////	public void dispose () {
////		batch.dispose();
////
////
//// 		img.dispose();
//
//import com.badlogic.gdx.ApplicationListener;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Batch;
//import com.badlogic.gdx.scenes.scene2d.Actor;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
////import com.badlogic.gdx.ApplicationAdapter;
////import com.badlogic.gdx.Gdx;
////import com.badlogic.gdx.graphics.GL20;
////import com.badlogic.gdx.graphics.g2d.SpriteBatch;
////import com.badlogic.gdx.graphics.Texture;
////import com.badlogic.gdx.scenes.scene2d.Actor;
////import com.badlogic.gdx.scenes.scene2d.InputEvent;
////import com.badlogic.gdx.scenes.scene2d.Stage;
////import com.badlogic.gdx.scenes.scene2d.actions.Actions;
////import com.badlogic.gdx.scenes.scene2d.ui.Image;
////
////public class MyGdxGame extends ApplicationAdapter  {
//////	SpriteBatch batch;
////	Texture img;
////	Stage stage;
////
////	@Override
////	public void create () {
//////		batch = new SpriteBatch();
////		img = new Texture("android/assets/badlogic.jpg");
////		stage = new Stage();
////		Image image = new Image(img);
////		image.addAction(Actions.moveTo(100,100, 2));
////		stage.addActor(image);
////	}
////
////
////
////	@Override
////	public void render () {
////		Gdx.gl.glClearColor(1, 0, 0, 1);
////		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
////		stage.act(Gdx.graphics.getDeltaTime());
////	stage.draw();
////	}
////
////
////}
//public class MyGdxGame implements ApplicationListener {
//	Stage stage;
//
//	public class MyActor extends Actor {
//		Texture texture = new Texture(Gdx.files.internal("android/assets/badlogic.jpg"));
//		@Override
//		public void draw(Batch batch, float alpha){
//			batch.draw(texture,0,0);
//		}
//	}
//
////	private Stage stage;
//
//	@Override
//	public void create() {
////		stage = new Stage(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),true);
//		stage = new Stage();
//		MyActor myActor = new MyActor();
//		stage.addActor(myActor);
//	}
//
//	@Override
//	public void dispose() {
//		stage.dispose();
//	}
//
//	@Override
//	public void render() {
////		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//		stage.draw();
//	}
//
//	@Override
//	public void resize(int width, int height) {
//	}
//
//	@Override
//	public void pause() {
//	}
//
//	@Override
//	public void resume() {
//	}
//}

//import com.badlogic.gdx.ApplicationListener;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Batch;
//import com.badlogic.gdx.scenes.scene2d.Actor;
//import com.badlogic.gdx.scenes.scene2d.InputEvent;
//import com.badlogic.gdx.scenes.scene2d.InputListener;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.Touchable;
//
//public class MyGdxGame implements ApplicationListener {
//
//	public class MyActor extends Actor {
//		Texture texture = new Texture(Gdx.files.internal("android/assets/badlogic.jpg"));
//		float actorX = 0, actorY = 0;
//		public boolean started = false;
//
//		public MyActor(){
//			setBounds(actorX,actorY,texture.getWidth(),texture.getHeight());
//			addListener(new InputListener(){
//				public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//					System.out.println("X and Y vallues: " + x + ", " + y);
//					((MyActor)event.getTarget()).started = true;
//					return true;
//				}
//			});
//		}
//
//
//		@Override
//		public void draw(Batch batch, float alpha){
//			batch.draw(texture,actorX,actorY);
//		}
//
//		@Override
//		public void act(float delta){
//			if(started){
//				actorX+=5;
//			}
//		}
//	}

	private Stage stage;
	private Image image;

	Texture texture ;
	@Override
	public void create() {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		texture = new Texture("android/assets/badlogic.jpg");
		image = new Image(texture);
		image.addAction(Actions.moveTo(300,300, 2));

		stage.addActor(image);
	}




	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}




}