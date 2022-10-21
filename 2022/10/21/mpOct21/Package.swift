// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct21",
    products: [
        .library(
            name: "mpOct21",
            targets: ["mpOct21"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct21",
            dependencies: []),
        .testTarget(
            name: "mpOct21Tests",
            dependencies: ["mpOct21"]),
    ]
)
