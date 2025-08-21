from flask import Flask , jsonify 
from flask_cors import CORS 
import os

app = Flask(__name__)
CORS(app)

@app.route('/')

def home():
    return jsonify({"message":"connected!"})

@app.route('/songs/')
def list_raw_songs():
    raw_song_list=os.listdir(".")
    song_list_arr=[s for s in raw_song_list if s.endswith("mp3")]
    return jsonify({
        "songs":song_list_arr,"message":"songs sent"
        })


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=8055,debug=True)
