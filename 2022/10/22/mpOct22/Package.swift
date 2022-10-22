// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct22",
    products: [
        .library(
            name: "mpOct22",
            targets: ["mpOct22"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct22",
            dependencies: []),
        .testTarget(
            name: "mpOct22Tests",
            dependencies: ["mpOct22"]),
    ]
)
