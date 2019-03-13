# Bassic-Phrasse
App Basic audio Phrasse


### Priview
![Screen Shot 2019-03-13 at 15 19 06](https://user-images.githubusercontent.com/43386555/54263604-cc3c4b00-45a3-11e9-83db-9bd22c97c3c1.png)

### 1.  Source
    public void buttonTapped(View view) {
        int id = view.getId();
        String ourID = "";

        ourID = view.getResources().getResourceEntryName(id);

        //this is get file raw using name ID
        int resorceID = getResources().getIdentifier(ourID, "raw", "com.redudant.bassiphases");

        MediaPlayer mPlayer = MediaPlayer.create(this, resorceID);
        mPlayer.start();


### 2. if you find an error like this MediaPlayer: Error (1,-19)
**add this code

      //this function so that there is no error when taped many times
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
