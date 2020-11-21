#入力内容
sid = "19H081"
name = "久井颯生"

def file_processing(path)
  # Dir.chdir(path)
  # Dir::open("#{path}", encoding:"UTF-8"){|d|
  #   d.each{|dir|
  Dir::foreach(path, encoding:"Shift JIS"=>"UTF-8"){|dir|
  #     # next if dir == '.' or dir == '..' #".",".."の排除
  #     next unless dir.match(/Sample/)#Sample以外の排除

  #     #ファイル番号の作成
  #     bn = File.basename(dir, ".*")
  #     fn = bn.gsub(/[^\d]/, "").to_i#そのままの数字
  #     fn_0 = "%02d" % fn#二桁

  #     #１行コメントの追加
  #     # 学籍番号:777777，氏名:太郎，Sample番号:1
  #     File.open("#{path}/#{dir}","r+") do |file|
  #       line = file.read #元の文
  #       line.gsub(/Sample#{fn}/,"Sample#{@dir_num}_#{fn_0}")#class名の変更
  #       file.seek(0)#先頭ポイントを設定
  #       file.puts("学籍番号:#{sid}，氏名:#{name}，Sample番号:#{fn}"+ line)#上書き
  #     end
  }
  # Dir::chdir("/Users/somahisai/Desktop/プログラミング演習２/YJSample/")
end

for @dir_num in 1..16 do
  #２桁のディレクトリ番号
  @dir_num = "%02d" % @dir_num

  
  if @dir_num == 13
    file_processing("13/pa")
    file_processing("13/pa/sub")
    file_processing("13/pb")
  end
  file_processing(@dir_num)
end