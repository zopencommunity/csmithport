[![Automatic version updates](https://github.com/zopencommunity/csmithport/actions/workflows/bump.yml/badge.svg)](https://github.com/ZOSOpenTools/csmithport/actions/workflows/bump.yml)

# csmith

Csmith is a random generator of C programs. It's primary purpose is to find compiler bugs with random programs, using differential testing as the test oracle. Csmith can be used outside of the field of compiler testing. If your application needs a test suite of C programs and you don't bother to write them, feel free to give Csmith a try. Csmith outputs C programs free of undefined behaviors (believe us, that's not trivial), and the statistics of each generated program.

# Installation and Usage

Use the zopen package manager ([QuickStart Guide](https://zopen.community/#/Guides/QuickStart)) to install:
```bash
zopen install csmith
```

# Building from Source

1. Clone the repository:
```bash
git clone https://github.com/zopencommunity/csmithport.git
cd csmithport
```
2. Build using zopen:
```bash
zopen build -vv
```

See the [zopen porting guide](https://zopen.community/#/Guides/Porting) for more details.

# Documentation


# Troubleshooting

# Contributing
Contributions are welcome! Please follow the [zopen contribution guidelines](https://github.com/zopencommunity/meta/blob/main/CONTRIBUTING.md).
