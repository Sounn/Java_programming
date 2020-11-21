# for dir_name in 1..16 do
#   #ディレクトリの移動
#   dir_name = "%02d" % dir_name
#   Dir::chdir("#{dir_name}")

  Dir::foreach("test"){|dir|
    # next if dir == '.' or dir == '..' #".",".."の排除k
    next unless dir.match(/b/)#".",".."の排除
    File.open("test/#{dir}","r+") do |file|
      line = file.read
      file.seek(0)
      file.puts("アンパンちゃん\n" + line)
    end
    # File.read("#{dir}")
  }

#   #１つ上のディレクトリに移動
#   Dir::chdir("..")
# end


