import webbrowser
import time

class OpenTabs:
    def __init__(self, urls):
        self.urls = urls        

    def open_all(self):
        for url in self.urls:
            webbrowser.open_new_tab(url)
            time.sleep(1)   
        print("All tabs opened.")

if __name__ == "__main__":
    urls = [
        "https://mail.google.com/mail/u/0/#inbox",
        "https://leetcode.com/problemset/",
        "https://chatgpt.com/",
        "https://www.w3schools.com/",
        "https://www.youtube.com/"
    ]
    opener = OpenTabs(urls)
    opener.open_all()